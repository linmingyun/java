package math;

/**
 * java之Math类的一些用法
 */
public class TestMath {

	public static void main(String[] args) {
		//生成随机数
	    double a = Math.random();
	    System.out.println("生成随机数："+ a);
	    //平方根
	    System.out.println("3的平方加4的平方的平方根：" + Math.sqrt(4*4+3*3));
	    //Math.pow(x,y)：x的y次方
	    System.out.println("3的2次方：" + Math.pow(3, 2));
	    //四舍五入
	    System.out.println("1.5四舍五入：" + Math.round(1.5));
	    //常量e
	    System.out.println("e=" + Math.E);
	    //自然对数
	    System.out.println("对数：" + Math.log(Math.pow(Math.E, 15)));
	    //圆周率
	    System.out.println("圆周率：" + Math.PI);
	    //转换为度大致相等的角度，以弧度为单位的角度。从角度到弧度的转换通常是不精确的。
	    double b = 60.0;
	    System.out.println(Math.toRadians(b));
	    //转换以弧度为单位测得的角度大致相等的角度，以度衡量。
	    double c = Math.PI/4;
	    System.out.println(Math.toDegrees(c));
	}

}
