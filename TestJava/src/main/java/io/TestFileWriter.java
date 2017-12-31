package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//java之FileWriter类
public class TestFileWriter {

  public static void main(String[] args) {
    try {
//      FileWriter fw = new FileWriter("d:\\unicode.txt");
//      for(int c=0;c<=50000;c++){
//        fw.write(c);
//      }
//      fw.close();
      
      FileReader fr1 = new FileReader("D:/Java/ShangHai/Test/src/io/TestFileWriter.java");
      FileWriter fw1 = new FileWriter("D:/TestFileWriter.java");
      int b;
      while((b = fr1.read()) != -1) {
        fw1.write(b);
      }
      fr1.close();
      fw1.close();
    } catch (IOException e1) {
      e1.printStackTrace();
      System.out.println("文件写入错误");
      System.exit(-1);
    }
  }

}
