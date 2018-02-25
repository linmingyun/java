package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

//java之BufferedReader类
public class VinCombine {

  public static void main(String[] args) {
      list("d:\\vin.txt", System.out);
  }

  public static void list(String f, PrintStream fs) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(f));
      String s = null;
      String str = "";
      int i = 0;
      while ((s = br.readLine()) != null) {
//    	  str += ""+s.trim()+",";
    	  str += "'" + s.trim()+"',";
    	  i++;
    	  if(i%1000==0)str+="//////////";
          //fs.println(s);
//    	  str += "\""+s.trim()+"\"+\n";
//    	  i++;
      }
      System.out.println(str);
      System.out.println(i);
      br.close();
    } catch (IOException e) {
      fs.println("无法读取文件");
    }
  }
}
