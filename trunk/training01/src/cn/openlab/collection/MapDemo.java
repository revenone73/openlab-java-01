package cn.openlab.collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		
		map.put("2", "er");
		
		System.out.println(map.get("2"));
	}
}
