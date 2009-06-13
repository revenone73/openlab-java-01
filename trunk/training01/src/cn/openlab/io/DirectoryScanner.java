package cn.openlab.io;

import java.io.File;

public class DirectoryScanner {

	public static void main(String[] args) {
		File file = new File("F:\\books");
		print(file);
	}
	
	public static void print(File directory) {
		File[] files = directory.listFiles();
		for(File file : files) {
			if(file.isFile()) {
				System.out.println(file);
			} else if (file.isDirectory()) {
				print(file);
			}
		}
	}
}
