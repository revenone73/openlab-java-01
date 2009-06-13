package cn.openlab.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerialization {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		FileOutputStream fis = new FileOutputStream("");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(list);
	}
}
