package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//java֮FileInputStream��
public class TestFileInputStream {

  public static void main(String[] args) {
    int b = 0;
    FileInputStream in = null;
    try {
      in = new FileInputStream("D:\\vin.txt");
    } catch (FileNotFoundException e) {
      System.out.println("�Ҳ���ָ���ļ�"); 
      System.exit(-1);
    }
    
    try {
      long num = 0;
      while((b=in.read())!=-1){
        System.out.print((char)b); 
        num++;
      }
      in.close();  
      System.out.println();
      System.out.println("����ȡ�� "+num+" ���ֽ�");
    } catch (IOException e1) {
      System.out.println("�ļ���ȡ����"); 
      System.exit(-1);
    }
  }

}
