package regexp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Email��֩����򡪡�ץȡ��ҳ�е�email��ַ
public class EmailSpider {

  public static void main(String[] args) {
    try {
      String str = new String();
      System.out.println(str);
      System.out.println(str);
      System.out.println(str);
      
      BufferedReader br = new BufferedReader(new FileReader("D:\\share\\courseware\\1043633.html"));
      String line = "";
      while ((line = br.readLine()) != null) {
        parse(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void parse(String line) {
    Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
    Matcher m = p.matcher(line);
    while (m.find()) {
      System.out.println(m.group());
    }
  }

}
