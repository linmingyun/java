package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * java之Map接口
 */
public class TestMap {

	public static void main(String[] args) {
	    Map<String, Object> m1 = new HashMap<String, Object>(); 
	    m1.put("one", 1);
	    m1.put("two", 2);
	    m1.put("three", 3);
	    System.out.println(m1.size()); //3
	    //判断Map对象的Key是否包含某个元素
	    System.out.println(m1.containsKey("one")); //true
	    if(m1.containsKey("two")) {
			int i = (Integer)m1.get("two");
			System.out.println(i); //2
		}
	    
	    Map<String, Object> m2 = new TreeMap<String, Object>();
	    m2.put("A", 1);
	    m2.put("B", 2);
	    //判断Map对象的Value是否包含某个元素
	    System.out.println(m2.containsValue(1)); //true

	    //用某个Map对象创建另一个Map对象
	    Map<String, Object> m3 = new HashMap<String, Object>(m1);
	    //将某个Map对象的所有元素都添加到另一个Map对象里
	    m3.putAll(m2);
	    System.out.println(m3);//{one=1, A=1, two=2, three=3, B=2}
	    
	    System.out.println("///////////////遍历///////////////");
	    
	    Map<String, String> map = new HashMap<String, String>(); 
	    map.put("one", "1");
	    map.put("two", "2");
	    map.put("three", "3");
	    //第一种遍历方法
	    traversal(map);
	    System.out.println("//////////////////////////////////");
	    //第二种遍历方法
	    traversalByKeySet(map);
	    System.out.println("//////////////////////////////////");
	    //第三种遍历方法
	    traversalByEntry(map);
	}
	
	//最常规的一种遍历方法，最常规就是最常用的，虽然不复杂，但很重要，这是我们最熟悉的，就不多说了！！
	public static void traversal(Map<String, String> map) {
		Collection<String> c = map.values();
		Iterator<String> it = c.iterator();
		for (; it.hasNext();) {
			System.out.println(it.next());
		}
	}

    //利用keyset进行遍历，它的优点在于可以根据你所想要的key值得到你想要的 values，更具灵活性！！
    public static void traversalByKeySet(Map<String, String> map) {
        Set<String> key = map.keySet();
        for (Iterator<String> it = key.iterator(); it.hasNext();) {
            String s = (String) it.next();
            System.out.println(map.get(s));
        }
    }
    
	//比较复杂的一种遍历在这里，呵呵~~他很暴力哦，它的灵活性太强了，想得到什么就能得到什么~~
	public static void traversalByEntry(Map<String, String> map) {
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}
