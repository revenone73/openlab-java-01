package cn.openlab.oo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入日期，格式yyyy-MM-dd:");
		String s = scanner.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(s);
		} catch (ParseException e) {
			System.out.println("日期格式错误");
		}
		System.out.println("程序正常退出");
	}
}
