package stringbuffer;

/**
 * java֮StringBuffer��һЩ�÷�
 */
public class TestStringBuffer {

	public static void main(String[] args) {
		//append����׷�����ݵ���ǰStringBuffer�����ĩβ���������ַ��������ӡ�
	    String str = "Microsoft";
	    StringBuffer sbf = new StringBuffer(str);
	    sbf.append("/").append("IBM");
	    sbf.append("/").append("Sun");
	    System.out.println(sbf);
	    
	    sbf = new StringBuffer("");
	    for(int i=0; i<10; i++)sbf.append(i);
	    System.out.println(sbf);
	    //ɾ��ָ��λ�õ��ַ���Ȼ��ʣ��������γ��µ��ַ�����
	    System.out.println(sbf.deleteCharAt(0));
	    //ɾ��ָ���������ڵ������ַ�������start��������end����ֵ�����䡣
	    sbf.delete(7, sbf.length());
	    System.out.println(sbf);
	    
	    //����
	    char[] array = {'a','b','c'};
	    sbf.insert(0, array);
	    sbf.insert(3, "#");
	    System.out.println(sbf);
	    //��ת
	    sbf.reverse();
	    System.out.println(sbf);
	}

}
