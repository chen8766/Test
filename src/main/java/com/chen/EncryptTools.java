package com.chen;

import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class EncryptTools {

    private static final String ALGORITHM = "AES";

    public static void main(String[] args) {
        try {
            String content = "abc";
            SecretKey secretKey = generateKey("chenlong");
            byte[] encryptResult = encrypt(content, secretKey);
            String str = new BASE64Encoder().encode(encryptResult);
            System.out.println(str);
            System.out.println(decrypt(encryptResult, secretKey));
        } catch (NoSuchAlgorithmException | IllegalBlockSizeException | InvalidKeyException | BadPaddingException | NoSuchPaddingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public static SecretKey generateKey(String key) throws NoSuchAlgorithmException {
        if (key == null) {
            key = "";
        }
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(key.getBytes());
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(secureRandom);
        return keyGenerator.generateKey();
    }

    public static byte[] encrypt(String content, SecretKey secretKey) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        return aes(content.getBytes("utf-8"), Cipher.ENCRYPT_MODE, secretKey);
    }

    public static String decrypt(byte[] contentArray, SecretKey secretKey) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        byte[] result = aes(contentArray, Cipher.DECRYPT_MODE, secretKey);
        return new String(result, "utf-8");
    }

    public static byte[] aes(byte[] content, int mode, SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        byte[] encodeFormat = secretKey.getEncoded();
        SecretKeySpec key = new SecretKeySpec(encodeFormat, ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(mode, key);
        return cipher.doFinal(content);
    }


}
