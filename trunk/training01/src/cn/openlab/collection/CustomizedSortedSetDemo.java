package cn.openlab.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CustomizedSortedSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new Student("a", 5));
		set.add(new Student("b", 4));
		set.add(new Student("c", 6));
		
		set.add(new Student("a", 5));

		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Student s = (Student) iter.next();
			System.out.println(s);
		}
	}
}
