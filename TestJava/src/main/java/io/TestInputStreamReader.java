package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java֮InputStreamReader��
public class TestInputStreamReader {

  public static void main(String[] args) {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = null;
    try {
      s = br.readLine();
      while(s!=null){
        if(s.equalsIgnoreCase("exit")) break;
        System.out.println(s.toUpperCase());
        s = br.readLine();
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
