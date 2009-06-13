package cn.openlab.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("#");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
