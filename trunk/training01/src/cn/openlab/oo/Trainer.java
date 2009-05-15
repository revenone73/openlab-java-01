package cn.openlab.oo;

public class Trainer {

	public void feed(Animal a) {
		System.out.println("feed an animal");
		a.eat();
	}

	public void feed(Dog d) {
		System.out.println("feed a dog");
		d.eat();
	}

	public void feed(Eatable e) {
		System.out.println("feed eatable");
		e.eat();
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Animal a2 = d;
		Eatable e = d;
		
		Trainer t = new Trainer();
//		t.feed(a);
//		t.feed(d);
		t.feed(a2);
		t.feed(e);
	}
}
