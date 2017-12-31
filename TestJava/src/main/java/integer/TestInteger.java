package integer;

/**
 * java֮Integer���һЩ�÷�
 */
public class TestInteger {

	public static void main(String[] args) {
		//intתInteger
		int i = 1;
		Integer j = new Integer(i);
		System.out.println("i=" + i + ",j=" + j);
		
		//Integerתint
		Integer k = new Integer(2);
		int l = k.intValue();
		System.out.println("k=" + k + ",l=" + l);
		
		//java��Integer���Ͷ���-128~127֮��������Ǵӻ�����ȡ�ģ������õȺűȽ���һ�µġ�
		Integer m = 3;
		Integer n = 3;
		System.out.println("(m==n):" + (m == n));
		//���ڲ���-128~127���������������ڶ���new�����ģ����Ե�ַ�ռ䲻һ����Ҳ�Ͳ���ȡ�
		Integer o = 129;
		Integer p = 129;
		System.out.println("(o==p):" + (o == p));
		System.out.println("(o.intValue()==p.intValue()):" + (o.intValue() == p.intValue()));
		
		//֮ǰ������һ��bug���˲���ʱ����ҳ�ԭ�򣬾��ǵ�q����null��ʱ��ᱨ��ָ���쳣��
		Integer q = 4;
		System.out.println(q == 4);
		System.out.println("Integerתfloat��" + q.floatValue());
		System.out.println("Integerתdouble��" + q.doubleValue());
		
	    System.out.println("�����ƣ�" + Integer.toBinaryString(16)+"B"); //������
	    System.out.println("�˽��ƣ�" + Integer.toOctalString(16)+"O"); //�˽���
	    System.out.println("ʮ�����ƣ�" + Integer.toHexString(16)+"H"); //ʮ������
	}

}
