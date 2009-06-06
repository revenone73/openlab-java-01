package cn.openlab.collection;

import java.util.ArrayList;


public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i = 0; i < 10; i++) {
			list.add(new Integer(i));
		}
		
//		list.add("ten");
		
		Integer num = (Integer) list.get(10);
		System.out.println(num);
	}
}
