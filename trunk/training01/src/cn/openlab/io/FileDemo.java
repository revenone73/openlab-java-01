package cn.openlab.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("f:\\compare.htm");
		FileInputStream fis = new FileInputStream(file);
		
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
}
