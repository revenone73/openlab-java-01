package cn.openlab.oo;

public class Rect {

	private int length;
	private int width;
	
	public Rect() {
		this(5,5);
		System.out.println("*******");
	}
	
	public Rect(int length, int width) {
		System.out.println("�����ڹ���һ�����Σ�����" + length + "������" + width);
		this.length = length;
		this.width = width;
	}
	
	public Rect(int length){
		this(length,length);
	}
	
	public int area() {
		return length * width;
	}
	
	public static void main(String[] args) {
		Rect r = new Rect(5);
		
	}
}
