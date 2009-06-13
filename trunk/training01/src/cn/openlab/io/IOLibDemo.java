package cn.openlab.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class IOLibDemo {

	public static void main(String[] args) throws Exception {
		List<String> lines = IOUtils.readLines(new FileInputStream(new File("file path")));
		for(String line : lines) {
			System.out.println(line);
		}
	}
}
