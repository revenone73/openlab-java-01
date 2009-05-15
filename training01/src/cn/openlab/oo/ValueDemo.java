package cn.openlab.oo;

public class ValueDemo {

	public static void main(String[] args) {
		MyString s = new MyString();
		char[] cs = s.getChars();
		cs[1] = 'E';
		System.out.println(s.toString());
	}
}
