package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * java之Map转List
 */
public class TestMapToList {

	/**
	 * 获取Map的Key的值，将一个含n个键值对的Map转成一个含n个Map的List
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("NUMBER", "007");
		map.put("NAME", "张三");
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext();) {
		    Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
		    System.out.println(entry.getKey() + "--->" + entry.getValue());
			Map<String,String> temp = new HashMap<String,String>();
			temp.put("KEY", entry.getKey());
			temp.put("VALUE", entry.getValue());
			list.add(temp);
		}
		
		for(Map<String,String> temp : list){
			System.out.println("KEY:" + temp.get("KEY") + ",VALUE:" + temp.get("VALUE"));
		}
	}

}
