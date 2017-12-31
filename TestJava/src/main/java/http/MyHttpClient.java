package http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * @project SimpleHttpServer 
 * @author sunnylocus 
 * @vresion 1.0 2009-9-2 
 * @description ������   
 */  
public class MyHttpClient {  
    public static void main(String[] args) {  
        ExecutorService exec = Executors.newCachedThreadPool();  
        // ���Բ�����MyHttpServer��Ӱ��  
        for (int i = 0; i < 20; i++) {  
            Runnable run = new Runnable() {  
                public void run() {  
                    try {  
                        startWork();  
                    } catch (IOException e) {  
                        e.printStackTrace();  
                    }  
                }  
            };  
            exec.execute(run);  
        }  
        exec.shutdown();// �ر��̳߳�  
    }  
  
    public static void startWork() throws IOException {  
        URL url = new URL("http://127.0.0.1:6666/myApp");  
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();  
        urlConn.setDoOutput(true);  
        urlConn.setDoInput(true);  
        urlConn.setRequestMethod("POST");  
        // �������ݰ�  
        String teststr = "this is a test message";  
        OutputStream out = urlConn.getOutputStream();  
        out.write(teststr.getBytes());  
        out.flush();  
        while (urlConn.getContentLength() != -1) {  
            if (urlConn.getResponseCode() == 200) {  
                InputStream in = urlConn.getInputStream();  
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));  
                String temp = "";  
                while ((temp = reader.readLine()) != null) {  
                    System.err.println("server response:" + temp);// ��ӡ�յ�����Ϣ  
                }  
                reader.close();  
                in.close();  
                urlConn.disconnect();  
            }  
        }  
    }  
}  