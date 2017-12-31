package string;

/**
 * java֮String�Ļ����÷�
 */
public class TestString {

	public static void main(String[] args) {
		//�ж������ַ����Ƿ����
	    String s1 = "hello";
	    String s2 = "hello";
	    //"hello"���ַ�������������� data segment
	    System.out.println(s1 == s2); //true
	    
	    s1 = new String("hello");
	    s2 = new String("hello");
	    System.out.println(s1 == s2); //false
	    System.out.println(s1.equals(s2)); //true
	    
	    //���ַ����鴴���ַ���
	    char c[] = {'s','u','n',' ','j','a','v','a'};
	    String s3 = new String(c);
	    String s4 = new String(c,4,4);
	    System.out.println(s3); //sun java
	    System.out.println(s4); //java
	    
	    //��ȡ�ַ����е�ĳ���ַ�
	    String s5 = "sun java";
	    String s6 = "sun Java";
	    System.out.println(s5.charAt(1)); //u
	    //��ȡ�ַ����ĳ���
	    System.out.println(s6.length()); //8
	    //��ȡĳһ�ַ�������һ�ַ����е�λ��
	    System.out.println(s5.indexOf("java")); //4
	    System.out.println(s5.indexOf("Java")); //-1
	    //�ж��ַ����Ƿ����
	    System.out.println(s5.equals(s6)); //false
	    System.out.println(s5.equalsIgnoreCase(s6)); //true
	    //�ж�ĳһ�ַ����Ƿ������һ�ַ���
	    System.out.println(s5.contains("sun")); //true
	    //�ַ����滻
	    System.out.println(s5.replace("sun", "oracle")); //oracle java
	    
	    String s9 = "Welcome to Java World!";
	    String s10 = "  sun java  ";
	    //�ж��Ƿ���ĳ���ַ�����ͷ
	    System.out.println(s9.startsWith("Welcome")); //true
	    //�ж��Ƿ���ĳ���ַ�����β
	    System.out.println(s9.endsWith("World")); //false
	    //Сд
	    System.out.println(s9.toLowerCase()); //welcome to java world!
	    //��д
	    System.out.println(s9.toUpperCase()); //WELCOME TO JAVA WORLD!
	    //�ַ�����ȡ
	    System.out.println(s9.substring(11)); //Java World!
	    //ȥ���ַ�����β�Ŀո�
	    System.out.println(s10.trim()); //sun java
	    
	    //intתString
	    int num = 12345;
	    String strNum = String.valueOf(num);
	    System.out.println(strNum);
	    
	    //���ַ�����ĳ���ַ����
	    String str = "9,11,2012";
	    String[] strArray = str.split(",");
	    for(int i=0; i<strArray.length; i++){
	      System.out.println(strArray[i]);
	    }
	}

}
