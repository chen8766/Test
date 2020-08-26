import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MyTest {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        /*for (int i = 0; i < 10; i++) {
            new Thread("thread-" + i) {
                @Override
                public void run() {
                    while (true) {
                        String urlParam = "http://localhost:8080/ibossDAPP/push_transaction";
                        String requestType = "GET";

                        HttpURLConnection con = null;

                        BufferedReader buffer = null;
                        StringBuffer resultBuffer = null;

                        try {
                            URL url = new URL(urlParam);
                            //得到连接对象
                            con = (HttpURLConnection) url.openConnection();
                            //设置请求类型
                            con.setRequestMethod(requestType);
                            //设置请求需要返回的数据类型和字符集类型
                            con.setRequestProperty("Content-Type", "application/json;charset=GBK");
                            //允许写出
                            con.setDoOutput(true);
                            //允许读入
                            con.setDoInput(true);
                            //不使用缓存
                            con.setUseCaches(false);
                            //得到响应码
                            int responseCode = con.getResponseCode();

                            if (responseCode == HttpURLConnection.HTTP_OK) {
                                //得到响应流
                                InputStream inputStream = con.getInputStream();
                                //将响应流转换成字符串
                                resultBuffer = new StringBuffer();
                                String line;
                                buffer = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                                while ((line = buffer.readLine()) != null) {
                                    resultBuffer.append(line);
                                    System.out.println(line);
                                }
                                Thread.sleep(50);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            if (con != null) {
                                con.disconnect();
                            }
                        }
                    }
                }
            }.start();*/
        }


        /*new Thread("thread-2"){
            @Override
            public void run() {
                while (true) {
                    String urlParam = "http://localhost:8080/ibossDAPP/push_transaction";
                    String requestType = "GET";

                    HttpURLConnection con = null;

                    BufferedReader buffer = null;
                    StringBuffer resultBuffer = null;

                    try {
                        URL url = new URL(urlParam);
                        //得到连接对象
                        con = (HttpURLConnection) url.openConnection();
                        //设置请求类型
                        con.setRequestMethod(requestType);
                        //设置请求需要返回的数据类型和字符集类型
                        con.setRequestProperty("Content-Type", "application/json;charset=GBK");
                        //允许写出
                        con.setDoOutput(true);
                        //允许读入
                        con.setDoInput(true);
                        //不使用缓存
                        con.setUseCaches(false);
                        //得到响应码
                        int responseCode = con.getResponseCode();

                        if(responseCode == HttpURLConnection.HTTP_OK){
                            //得到响应流
                            InputStream inputStream = con.getInputStream();
                            //将响应流转换成字符串
                            resultBuffer = new StringBuffer();
                            String line;
                            buffer = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                            while ((line = buffer.readLine()) != null) {
                                resultBuffer.append(line);
                                System.out.println(line);
                            }
                        }
                        Thread.sleep(100);
                    } catch (
                            Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();*/
        // Thread.sleep(1000 * 60 * 10);
    // }
}
