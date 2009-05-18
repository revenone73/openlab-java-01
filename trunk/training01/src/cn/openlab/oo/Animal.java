package cn.openlab.oo;

public class Animal implements Eatable, Walkable {

	public Animal() {
		System.out.println("一只野兽产生了");
	}

	public void eat(){
		System.out.println("animal is eating");
	}

	public void walk() {
		
	}
}
