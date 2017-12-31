package io;

import java.io.*;
import java.util.Date;

//java֮BufferedReader��
public class TestBufferedReader {

  public static void main(String[] args) {
//    String filename = args[0];
//    if (filename != null) {
//      list(filename, System.out);
//    }
    
    String s = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      FileWriter fw = new FileWriter("d:\\vin.txt", true); //Log4J
      PrintWriter log = new PrintWriter(fw);
      while ((s = br.readLine())!=null) {
        if(s.equalsIgnoreCase("exit")) break;
        System.out.println(s.toUpperCase());
        log.println("-----");
        log.println(s.toUpperCase()); 
        log.flush();
      }
      log.println("==="+new Date()+"==="); 
      log.flush();
      log.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void list(String f, PrintStream fs) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(f));
      String s = null;
      while ((s = br.readLine()) != null) {
        fs.println(s);
      }
      br.close();
    } catch (IOException e) {
      fs.println("�޷���ȡ�ļ�");
    }
  }

}
