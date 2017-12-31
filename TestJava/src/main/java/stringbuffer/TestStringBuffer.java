package stringbuffer;

/**
 * java之StringBuffer的一些用法
 */
public class TestStringBuffer {

	public static void main(String[] args) {
		//append方法追加内容到当前StringBuffer对象的末尾，类似于字符串的连接。
	    String str = "Microsoft";
	    StringBuffer sbf = new StringBuffer(str);
	    sbf.append("/").append("IBM");
	    sbf.append("/").append("Sun");
	    System.out.println(sbf);
	    
	    sbf = new StringBuffer("");
	    for(int i=0; i<10; i++)sbf.append(i);
	    System.out.println(sbf);
	    //删除指定位置的字符，然后将剩余的内容形成新的字符串。
	    System.out.println(sbf.deleteCharAt(0));
	    //删除指定区间以内的所有字符，包含start，不包含end索引值的区间。
	    sbf.delete(7, sbf.length());
	    System.out.println(sbf);
	    
	    //插入
	    char[] array = {'a','b','c'};
	    sbf.insert(0, array);
	    sbf.insert(3, "#");
	    System.out.println(sbf);
	    //反转
	    sbf.reverse();
	    System.out.println(sbf);
	}

}
