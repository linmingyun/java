package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//java÷ÆOutputStreamWriter¿‡
public class TestOutputStreamWriter {

  public static void main(String[] args) {
    try {
      OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\char.txt"));
      osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
      osw = new OutputStreamWriter(new FileOutputStream("d:\\char.txt", true),"ISO8859_1");//latin-1
      osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
