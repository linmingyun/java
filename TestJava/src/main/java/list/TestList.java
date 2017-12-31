package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * java֮List�ӿ�
 */
public class TestList {

	public static void main(String[] args) {
		//���Ԫ��
	    List<String> list = new LinkedList<String>();
	    for(int i=0; i<6; i++){
	      list.add("a"+i);
	    }
	    System.out.println(list); //[a0, a1, a2, a3, a4, a5]
	    //��ָ��λ�����Ԫ��
	    list.add(3,"a100");
	    System.out.println(list); //[a0, a1, a2, a100, a3, a4, a5]
	    //�޸�ָ��λ�õ�����
	    list.set(6, "a200");
	    System.out.println(list); //[a0, a1, a2, a100, a3, a4, a200]
	    //��ȡָ��λ�õ�Ԫ��
	    System.out.println((String)list.get(2)); //a2
	    //��ȡָ��Ԫ�ص�λ��
	    System.out.println(list.indexOf("a3")); //4
	    //ɾ��ָ��λ�õ�Ԫ��
	    list.remove(1);
	    System.out.println(list); //[a0, a2, a100, a3, a4, a200]
	    
	    List<String> l = new LinkedList<String>();
	    for(int i=0; i<6; i++)l.add("a"+i);
	    System.out.println(l); //[a0, a1, a2, a3, a4, a5]
	    Collections.shuffle(l); //�������
	    System.out.println(l); //[a2, a0, a5, a4, a1, a3]
	    Collections.reverse(l); //����
	    System.out.println(l); //[a3, a1, a4, a5, a0, a2]
	    Collections.sort(l); //����
	    System.out.println(l); //[a0, a1, a2, a3, a4, a5]
	    //�۰����
	    System.out.println(Collections.binarySearch(l,"a5")); //5
	}

}
