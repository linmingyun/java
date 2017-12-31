package set;

import java.util.HashSet;
import java.util.Set;

/**
 * java之Set接口
 */
public class TestSet {

	public static void main(String[] args) {
	    Set<Object> s = new HashSet<Object>();
	    s.add("hello");
	    s.add("world");
	    s.add(new Integer(100));
	    s.add("hello"); //相同的元素不会被加入
	    System.out.println(s); //[100, hello, world]
	    
	    Set<String> s1 = new HashSet<String>();
	    s1.add("a");
	    s1.add("b");
	    s1.add("c");
	    Set<String> s2 = new HashSet<String>();
	    s2.add("a");
	    s2.add("b");
	    s2.add("d");
	    
	    //Set和List容器类都具有Constructor(Collection c)构造方法用以初始化容器类
	    Set<String> sn = new HashSet<String>(s1);
	    //retainAll方法用于从列表中移除未包含在指定collection中的所有元素
	    sn.retainAll(s2);
	    System.out.println(sn); //[a, b]
	    
	    Set<String> su = new HashSet<String>(s1);
	    su.addAll(s2);
	    System.out.println(su); //[d, a, c, b]
	}

}
