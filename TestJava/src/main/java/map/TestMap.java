package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * java֮Map�ӿ�
 */
public class TestMap {

	public static void main(String[] args) {
	    Map<String, Object> m1 = new HashMap<String, Object>(); 
	    m1.put("one", 1);
	    m1.put("two", 2);
	    m1.put("three", 3);
	    System.out.println(m1.size()); //3
	    //�ж�Map�����Key�Ƿ����ĳ��Ԫ��
	    System.out.println(m1.containsKey("one")); //true
	    if(m1.containsKey("two")) {
			int i = (Integer)m1.get("two");
			System.out.println(i); //2
		}
	    
	    Map<String, Object> m2 = new TreeMap<String, Object>();
	    m2.put("A", 1);
	    m2.put("B", 2);
	    //�ж�Map�����Value�Ƿ����ĳ��Ԫ��
	    System.out.println(m2.containsValue(1)); //true

	    //��ĳ��Map���󴴽���һ��Map����
	    Map<String, Object> m3 = new HashMap<String, Object>(m1);
	    //��ĳ��Map���������Ԫ�ض���ӵ���һ��Map������
	    m3.putAll(m2);
	    System.out.println(m3);//{one=1, A=1, two=2, three=3, B=2}
	    
	    System.out.println("///////////////����///////////////");
	    
	    Map<String, String> map = new HashMap<String, String>(); 
	    map.put("one", "1");
	    map.put("two", "2");
	    map.put("three", "3");
	    //��һ�ֱ�������
	    traversal(map);
	    System.out.println("//////////////////////////////////");
	    //�ڶ��ֱ�������
	    traversalByKeySet(map);
	    System.out.println("//////////////////////////////////");
	    //�����ֱ�������
	    traversalByEntry(map);
	}
	
	//����һ�ֱ�����������������õģ���Ȼ�����ӣ�������Ҫ��������������Ϥ�ģ��Ͳ���˵�ˣ���
	public static void traversal(Map<String, String> map) {
		Collection<String> c = map.values();
		Iterator<String> it = c.iterator();
		for (; it.hasNext();) {
			System.out.println(it.next());
		}
	}

    //����keyset���б����������ŵ����ڿ��Ը���������Ҫ��keyֵ�õ�����Ҫ�� values����������ԣ���
    public static void traversalByKeySet(Map<String, String> map) {
        Set<String> key = map.keySet();
        for (Iterator<String> it = key.iterator(); it.hasNext();) {
            String s = (String) it.next();
            System.out.println(map.get(s));
        }
    }
    
	//�Ƚϸ��ӵ�һ�ֱ���������Ǻ�~~���ܱ���Ŷ�����������̫ǿ�ˣ���õ�ʲô���ܵõ�ʲô~~
	public static void traversalByEntry(Map<String, String> map) {
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}
