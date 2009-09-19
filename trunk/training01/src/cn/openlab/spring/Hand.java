package cn.openlab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sun.swing.FilePane;

public class Hand {

	private Finger finger;

	public Finger getFinger() {
		return finger;
	}

	public void setFinger(Finger finger) {
		this.finger = finger;
	}
	
	public static void main(String[] args) {
		Hand hand = new Hand();
		System.out.println(hand.getFinger());
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hand h2 = (Hand)ac.getBean("hand");
		System.out.println(h2.getFinger());
		
		
	}
}
