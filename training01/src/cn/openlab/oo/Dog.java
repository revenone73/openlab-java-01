package cn.openlab.oo;

public class Dog extends Animal {

	public void eat() {
		if(legs == 4) {
			System.out.println("sdfasdf");
		} else {
			System.out.println("dfakjs");
		}
		System.out.println("dog is eating");
	}
	public int getLegs() {
		return legs;
	}
	private int legs = 4;
	
//	public void setLegs(int count) {
//		legs = count;
//	}
}
