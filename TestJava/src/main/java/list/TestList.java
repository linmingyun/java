package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * java之List接口
 */
public class TestList {

	public static void main(String[] args) {
		//添加元素
	    List<String> list = new LinkedList<String>();
	    for(int i=0; i<6; i++){
	      list.add("a"+i);
	    }
	    System.out.println(list); //[a0, a1, a2, a3, a4, a5]
	    //在指定位置添加元素
	    list.add(3,"a100");
	    System.out.println(list); //[a0, a1, a2, a100, a3, a4, a5]
	    //修改指定位置的内容
	    list.set(6, "a200");
	    System.out.println(list); //[a0, a1, a2, a100, a3, a4, a200]
	    //获取指定位置的元素
	    System.out.println((String)list.get(2)); //a2
	    //获取指定元素的位置
	    System.out.println(list.indexOf("a3")); //4
	    //删除指定位置的元素
	    list.remove(1);
	    System.out.println(list); //[a0, a2, a100, a3, a4, a200]
	    
	    List<String> l = new LinkedList<String>();
	    for(int i=0; i<6; i++)l.add("a"+i);
	    System.out.println(l); //[a0, a1, a2, a3, a4, a5]
	    Collections.shuffle(l); //随机排列
	    System.out.println(l); //[a2, a0, a5, a4, a1, a3]
	    Collections.reverse(l); //逆序
	    System.out.println(l); //[a3, a1, a4, a5, a0, a2]
	    Collections.sort(l); //排序
	    System.out.println(l); //[a0, a1, a2, a3, a4, a5]
	    //折半查找
	    System.out.println(Collections.binarySearch(l,"a5")); //5
	}

}
