package cn.openlab.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();

		Integer a= new Integer(6);
		Integer b= new Integer(6);
		
		set.add(a);
		set.add(b);

//		set.add("a");
//		set.add(new Integer(8));
//		
		Iterator iter = set.iterator();
//
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
		
//		Object o = iter.next();
//		System.out.println(o==a);
//		System.out.println(o==b);
	}
}
