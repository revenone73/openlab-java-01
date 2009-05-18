package cn.openlab.oo;

public class MyString {

	private char[] cs = {'h','e','l','l','o'};
	
	public char[] getChars() {
		char[] value = new char[cs.length];
		for(int i = 0; i < value.length; i++) {
			value[i] = cs[i];
		}
		return value;
	}

	public String toString() {
		String s = new String(cs);
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}
