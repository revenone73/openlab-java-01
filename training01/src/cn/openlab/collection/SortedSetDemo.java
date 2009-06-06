package cn.openlab.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet();
//		Set set = new HashSet();

		set.add("c");
		set.add("a");
		set.add("b");
		set.add("d");
		set.add(new Integer(1));
		iterateIt(set);
	}
	
	public static void iterateIt(Set set) {
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
