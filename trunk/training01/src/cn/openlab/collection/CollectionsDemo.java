package cn.openlab.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("a", 5));
		list.add(new Student("c", 6));
		list.add(new Student("b", 4));

		String sortBy = null;
		if(args.length == 1) {
			sortBy = args[0];
		}
		
		if("name".equals(sortBy)) {
			Collections.sort(list, new Comparator() {

				public int compare(Object arg0, Object arg1) {
					Student s1 = (Student) arg0;
					Student s2 = (Student) arg1;
					
					return s1.getName().compareTo(s2.getName());
				}
				
			});
		} else if("age".equals(sortBy)) {
			Collections.sort(list, new MyComparator());
		}

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class MyComparator implements Comparator {

	public int compare(Object arg0, Object arg1) {
		Student s1 = (Student) arg0;
		Student s2 = (Student) arg1;
		if(s1.getAge() > s2.getAge()) {
			return 1;
		} else if(s1.getAge() < s2.getAge()) {
			return -1;
		}
		return 0;
	}}