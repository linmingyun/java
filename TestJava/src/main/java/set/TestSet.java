package set;

import java.util.HashSet;
import java.util.Set;

/**
 * java֮Set�ӿ�
 */
public class TestSet {

	public static void main(String[] args) {
	    Set<Object> s = new HashSet<Object>();
	    s.add("hello");
	    s.add("world");
	    s.add(new Integer(100));
	    s.add("hello"); //��ͬ��Ԫ�ز��ᱻ����
	    System.out.println(s); //[100, hello, world]
	    
	    Set<String> s1 = new HashSet<String>();
	    s1.add("a");
	    s1.add("b");
	    s1.add("c");
	    Set<String> s2 = new HashSet<String>();
	    s2.add("a");
	    s2.add("b");
	    s2.add("d");
	    
	    //Set��List�����඼����Constructor(Collection c)���췽�����Գ�ʼ��������
	    Set<String> sn = new HashSet<String>(s1);
	    //retainAll�������ڴ��б����Ƴ�δ������ָ��collection�е�����Ԫ��
	    sn.retainAll(s2);
	    System.out.println(sn); //[a, b]
	    
	    Set<String> su = new HashSet<String>(s1);
	    su.addAll(s2);
	    System.out.println(su); //[d, a, c, b]
	}

}
