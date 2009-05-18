package cn.openlab.oo;

public class Dog extends Animal {

	public Dog() {
//		super();
		System.out.println("一只狗产生了");
	}

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
	
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}
