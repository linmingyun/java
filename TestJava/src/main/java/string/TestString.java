package string;

/**
 * java之String的基本用法
 */
public class TestString {

	public static void main(String[] args) {
		//判断两个字符串是否相等
	    String s1 = "hello";
	    String s2 = "hello";
	    //"hello"是字符串常量，存放在 data segment
	    System.out.println(s1 == s2); //true
	    
	    s1 = new String("hello");
	    s2 = new String("hello");
	    System.out.println(s1 == s2); //false
	    System.out.println(s1.equals(s2)); //true
	    
	    //用字符数组创建字符串
	    char c[] = {'s','u','n',' ','j','a','v','a'};
	    String s3 = new String(c);
	    String s4 = new String(c,4,4);
	    System.out.println(s3); //sun java
	    System.out.println(s4); //java
	    
	    //获取字符串中的某个字符
	    String s5 = "sun java";
	    String s6 = "sun Java";
	    System.out.println(s5.charAt(1)); //u
	    //获取字符串的长度
	    System.out.println(s6.length()); //8
	    //获取某一字符串在另一字符串中的位置
	    System.out.println(s5.indexOf("java")); //4
	    System.out.println(s5.indexOf("Java")); //-1
	    //判断字符串是否相等
	    System.out.println(s5.equals(s6)); //false
	    System.out.println(s5.equalsIgnoreCase(s6)); //true
	    //判断某一字符串是否包含另一字符串
	    System.out.println(s5.contains("sun")); //true
	    //字符串替换
	    System.out.println(s5.replace("sun", "oracle")); //oracle java
	    
	    String s9 = "Welcome to Java World!";
	    String s10 = "  sun java  ";
	    //判断是否以某个字符串开头
	    System.out.println(s9.startsWith("Welcome")); //true
	    //判断是否以某个字符串结尾
	    System.out.println(s9.endsWith("World")); //false
	    //小写
	    System.out.println(s9.toLowerCase()); //welcome to java world!
	    //大写
	    System.out.println(s9.toUpperCase()); //WELCOME TO JAVA WORLD!
	    //字符串截取
	    System.out.println(s9.substring(11)); //Java World!
	    //去掉字符串首尾的空格
	    System.out.println(s10.trim()); //sun java
	    
	    //int转String
	    int num = 12345;
	    String strNum = String.valueOf(num);
	    System.out.println(strNum);
	    
	    //将字符串按某个字符拆分
	    String str = "9,11,2012";
	    String[] strArray = str.split(",");
	    for(int i=0; i<strArray.length; i++){
	      System.out.println(strArray[i]);
	    }

	    byte[] buf = "123".getBytes();
		for (int i = 0; i < buf.length; i++) {
			System.out.println(buf[i]);
		}

	}

}
