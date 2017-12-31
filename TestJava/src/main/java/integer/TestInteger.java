package integer;

/**
 * java之Integer类的一些用法
 */
public class TestInteger {

	public static void main(String[] args) {
		//int转Integer
		int i = 1;
		Integer j = new Integer(i);
		System.out.println("i=" + i + ",j=" + j);
		
		//Integer转int
		Integer k = new Integer(2);
		int l = k.intValue();
		System.out.println("k=" + k + ",l=" + l);
		
		//java中Integer类型对于-128~127之间的数字是从缓冲区取的，所以用等号比较是一致的。
		Integer m = 3;
		Integer n = 3;
		System.out.println("(m==n):" + (m == n));
		//对于不在-128~127这个区间的数字是在堆中new出来的，所以地址空间不一样，也就不相等。
		Integer o = 129;
		Integer p = 129;
		System.out.println("(o==p):" + (o == p));
		System.out.println("(o.intValue()==p.intValue()):" + (o.intValue() == p.intValue()));
		
		//之前遇到过一个bug花了不少时间才找出原因，就是当q等于null的时候会报空指针异常。
		Integer q = 4;
		System.out.println(q == 4);
		System.out.println("Integer转float：" + q.floatValue());
		System.out.println("Integer转double：" + q.doubleValue());
		
	    System.out.println("二进制：" + Integer.toBinaryString(16)+"B"); //二进制
	    System.out.println("八进制：" + Integer.toOctalString(16)+"O"); //八进制
	    System.out.println("十六进制：" + Integer.toHexString(16)+"H"); //十六进制
	}

}
