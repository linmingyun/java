package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//java֮FileOutputStream��
public class TestFileOutputStream {

  public static void main(String[] args) {
    int b = 0;
    FileInputStream in = null;
    FileOutputStream out = null;
    try {
      in = new FileInputStream("D:\\Java\\BaosightWorkspace\\Test\\src\\io\\TestFileOutputStream.java");
      out = new FileOutputStream("D:/Test.java");
      while((b=in.read())!=-1){
        out.write(b);
      }
      in.close(); 
      out.close();
    } catch (FileNotFoundException e2) {
      System.out.println("�Ҳ���ָ���ļ�"); 
      System.exit(-1);
    } catch (IOException e1) {
      System.out.println("�ļ����ƴ���"); 
      System.exit(-1);
    }
    System.out.println("�ļ��Ѹ���");
  }

}
