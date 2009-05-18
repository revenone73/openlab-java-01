package cn.openlab.oo;

public class OverloadDemo {
	
	public void print(String s) {
		print(s, 1);
	}
	
	public void print(String s, int count) {
		System.out.println("it's printing a string");
		for(int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		OverloadDemo demo = new OverloadDemo();
		demo.print("hello");
//		demo.print("hello", 5);
	}
}
