package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//java之FileReader类
public class TestFileReader {

  public static void main(String[] args) {
    FileReader fr = null; 
    int c = 0;
    try {
      fr = new FileReader("D:\\Java\\BaosightWorkspace\\Test\\src\\io\\TestFileReader.java");
      while ((c = fr.read()) != -1) {
        System.out.print((char)c);
      }
      fr.close();
    } catch (FileNotFoundException e) {
      System.out.println("找不到指定文件");
    } catch (IOException e) {
      System.out.println("文件读取错误");
    }
  }

}
