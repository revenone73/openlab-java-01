package cn.openlab.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

public class FileDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("f:\\1.txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		
//		String line = br.readLine();
//		while(line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.write(" ");
		bw.write("world");
		bw.close();
		fw.close();
	}
}
