package cn.openlab.collection;

import java.util.ArrayList;
import java.util.HashMap;

import cn.openlab.oo.StructDemo;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("three");

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		
		int i = intList.get(1);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		
		String s = map.get(1);
		
		ArrayList<Student> sList = new ArrayList<Student>();
	}
}
