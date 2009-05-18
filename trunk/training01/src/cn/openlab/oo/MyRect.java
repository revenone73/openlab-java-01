package cn.openlab.oo;

public class MyRect extends Rect {

	private static MyRect instance;

	private MyRect() {
		super();
		System.out.println("------");
	}
	
	public MyRect(int length, int width) {
//		super(length, width);
	}
	
	public static MyRect getInstance() {
		if(instance == null) {
			instance = new MyRect();
		}
		return instance;
	}
}
