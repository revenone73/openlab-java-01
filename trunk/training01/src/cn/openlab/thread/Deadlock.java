package cn.openlab.thread;


public class Deadlock {
	static class Friend {
		private final String name;

		public Friend(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s has bowed to me!\n", this.name, bower.getName());
			bower.bowBack(this);
		}

		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s has bowed back to me!\n", this.name, bower.getName());
		}
	}

	public static void main(String[] args) {
		final Friend dog = new Friend("Dog");
		final Friend cat = new Friend("Cat");
		Thread tDog = new Thread(new Runnable() {
			public void run() {
				dog.bow(cat);
			}
		});
		tDog.start();
		Thread tCat = new Thread(new Runnable() {
			public void run() {
				cat.bow(dog);
			}
		});
		tCat.start();
	}
}
