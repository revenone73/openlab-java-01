package cn.openlab.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("go");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				
			}
			
		});
		t2.start();
	}
}
