package cn.openlab.thread;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiThreadFrameDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2,2));
		final JLabel label1 = new JLabel();
		label1.setText("label1");

		Thread t1 = new Thread() {
			int count = 0;

			public void run() {
				while(true) {
					count++;
					label1.setText(count + "");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		t1.start();

		final JLabel label2 = new JLabel();
		label2.setText("label2");

		frame.add(label1);
		frame.add(label2);

		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
