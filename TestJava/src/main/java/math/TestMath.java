package math;

/**
 * java֮Math���һЩ�÷�
 */
public class TestMath {

	public static void main(String[] args) {
		//���������
	    double a = Math.random();
	    System.out.println("�����������"+ a);
	    //ƽ����
	    System.out.println("3��ƽ����4��ƽ����ƽ������" + Math.sqrt(4*4+3*3));
	    //Math.pow(x,y)��x��y�η�
	    System.out.println("3��2�η���" + Math.pow(3, 2));
	    //��������
	    System.out.println("1.5�������룺" + Math.round(1.5));
	    //����e
	    System.out.println("e=" + Math.E);
	    //��Ȼ����
	    System.out.println("������" + Math.log(Math.pow(Math.E, 15)));
	    //Բ����
	    System.out.println("Բ���ʣ�" + Math.PI);
	    //ת��Ϊ�ȴ�����ȵĽǶȣ��Ի���Ϊ��λ�ĽǶȡ��ӽǶȵ����ȵ�ת��ͨ���ǲ���ȷ�ġ�
	    double b = 60.0;
	    System.out.println(Math.toRadians(b));
	    //ת���Ի���Ϊ��λ��õĽǶȴ�����ȵĽǶȣ��ԶȺ�����
	    double c = Math.PI/4;
	    System.out.println(Math.toDegrees(c));
	}

}
