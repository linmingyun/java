package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

  public static void main(String[] args) {
    //����ʶ������ʽ�ĸ���
    System.out.println("abc".matches("..."));//�ַ�ƥ�䣬һ�������һ����ĸ������abc����...����ģʽ�����true
    System.out.println("a8729a".replaceAll("\\d", "-"));//a----a,\d��������,\\d�������\d
    
    Pattern p = Pattern.compile("[a-z]{3}");//ƥ����3��Сд��ĸ��ɵ��ַ�����ģʽ
    Matcher m = p.matcher("fgh");
    System.out.println(m.matches());
    //����3��ȼ���������䣬������Ч�ʸߣ������кܶ���������
    System.out.println("fgh".matches("[a-z]{3}"));
    System.out.println("-----------");
    
    //������ʶ  . * + ?
    System.out.println("a".matches("."));
    System.out.println("aa".matches("aa"));
    System.out.println("aaaa".matches("a*"));//a*����a����0�λ���
    System.out.println("aaaa".matches("a+"));//a+����a����1�λ���
    System.out.println("".matches("a*"));
    System.out.println("aaaa".matches("a?"));//a?����a����0�λ�1��
    System.out.println("".matches("a?"));
    System.out.println("a".matches("a?"));
    System.out.println("214523145234532".matches("\\d{3,100}"));//���ٳ���3���������100��
    System.out.println("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
    System.out.println("192".matches("[0-2][0-9][0-9]"));//[]����Χ����һ��������0��2֮��...
    
    //��Χ
    System.out.println("a".matches("[abc]"));//[abc]����ȡabc�е�ĳһ���ַ�
    System.out.println("a".matches("[^abc]"));//[^abc]�������abc֮�������
    System.out.println("A".matches("[a-zA-Z]"));//��a��z���ߴ�A��Z
    System.out.println("A".matches("[a-z]|[A-Z]"));//��a��z���ߴ�A��Z
    System.out.println("A".matches("[a-z[A-Z]]"));//��a��z���ߴ�A��Z
    System.out.println("R".matches("[A-Z&&[RFG]]"));//��A��Z������RFG����֮һ
    
    //��ʶ\s \w \d \
    System.out.println(" \n\r\t".matches("\\s{4}"));//\\s{4}����4���ո�
    System.out.println(" ".matches("\\S"));//�ǿո�
    System.out.println("a_8".matches("\\w{3}"));//a��z��A��Z��_��0��9�е�3��
    System.out.println("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));//һ���������֣�&^#%�е�һ������
    System.out.println("\\".matches("\\\\"));//java��\\����\
    
    
    //POSIX Style
    System.out.println("a".matches("\\p{Lower}"));//����Сд��ĸ
    
    //boundary   
    System.out.println("hello sir".matches("^h.*"));//^h������h��ͷ
    System.out.println("hello sir".matches(".*ir$"));//ir$������ir����
    System.out.println("hello sir".matches("^h[a-z]{1,3}o\\b.*"));//\\b�����ʱ߽磬���ո���з���
    System.out.println("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
    
    //whilte lines
    System.out.println(" \n".matches("^[\\s&&[^\\n]]*\\n$"));//��ͷ�ǿո��Ҳ��ǻ��з��������Ի��з���β

    System.out.println("aaa 8888c".matches(".*\\d{4}."));//true
    System.out.println("aaa 8888c".matches(".*\\b\\d{4}."));//true
    System.out.println("aaa8888c".matches(".*\\d{4}."));//true
    System.out.println("aaa8888c".matches(".*\\b\\d{4}."));//false
    
    
    //email
    System.out.println("asdfasdfsafsf@dsdfsdf.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
    //[\\w[.-]]+�������ַ�����.����-����һ�λ���
    
    //matches find lookingAt
    Pattern p2 = Pattern.compile("\\d{3,5}");
    String s = "123-34345-234-00";
    Matcher m2 = p2.matcher(s);
    System.out.println(m2.matches());//matchesƥ�������ַ���
    m2.reset();//matches��find���໥Ӱ�죬��reset�ص���ʼ״̬������matches������123-��find������������
    System.out.println(m2.find());//findѰ���Ӵ�
    System.out.println(m2.start() + "-" + m2.end());//�ҵ����ַ�������ʼλ�úͽ���λ��
    System.out.println(m2.find());
    System.out.println(m2.start() + "-" + m2.end());
    System.out.println(m2.find());
    System.out.println(m2.start() + "-" + m2.end());
    System.out.println(m2.find());
    System.out.println(m2.lookingAt());//lookingAtÿ�ζ��ӿ�ͷ��
    System.out.println(m2.lookingAt());
    System.out.println(m2.lookingAt());
    System.out.println(m2.lookingAt());
    
    //replacement
    Pattern p3 = Pattern.compile("java", Pattern.CASE_INSENSITIVE);//���Դ�Сд
    Matcher m3 = p3.matcher("java Java JAVa JaVa IloveJAVA you hateJava afasdfasdf");
    StringBuffer buf = new StringBuffer();
    int i=0;
    while(m3.find()) {
      i++;
      if(i%2 == 0) {//ż�����滻��Сд��
        m3.appendReplacement(buf, "java");//�滻��ǰ�ҵ����ַ���
      } else {//�������滻�ɴ�д��
        m3.appendReplacement(buf, "JAVA");
      }
    }
    m3.appendTail(buf);//��β�� afasdfasdf����
    System.out.println(buf);
    
    //group    
    Pattern p4 = Pattern.compile("(\\d{3,5})([a-z]{2})");//��С���ŷ��飬һ��С����Ϊһ��
    String s4 = "123aa-34345bb-234cc-00";
    Matcher m4 = p4.matcher(s4);
    while(m4.find()) {//�жϵڼ����Ǹ�����С���ŵ�λ������
      System.out.println(m4.group(1));//��һ��
      System.out.println(m4.group(2));//�ڶ���
      System.out.println(m4.group());//������
    }
    
    
    //qulifiers
    /*
    Pattern p = Pattern.compile(".{3,10}+[0-9]");
    String s = "aaaa5bbbb68";
    Matcher m = p.matcher(s);
    if(m.find())
      p(m.start() + "-" + m.end());
    else 
      p("not match!");
    */
    
    //non-capturing groups
    /*
    Pattern p = Pattern.compile(".{3}(?=a)");
    String s = "444a66b";
    Matcher m = p.matcher(s);
    while(m.find()) {
      p(m.group());
    }
    */
    
    //back refenrences
    /*
    Pattern p = Pattern.compile("(\\d(\\d))\\2");
    String s = "122";
    Matcher m = p.matcher(s);
    p(m.matches());
    */
    
    //flags�ļ�д
    //Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
    //p("Java".matches("(?i)(java)"));
  }
  
  public static void p(Object o) {
    System.out.println(o);
  }
}
