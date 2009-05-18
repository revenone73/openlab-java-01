package cn.openlab.oo;

import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {
		MyRect rect = MyRect.getInstance();
		MyRect rect2 = MyRect.getInstance();
		rect2.area();
		
		
		Rect r = new Rect();
		
		System.out.println(rect == rect2);
	}
}
