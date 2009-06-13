package cn.openlab.thread;

public class MyThread extends Thread {

	public void run() {
		while(true) {
			System.out.println("*");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
