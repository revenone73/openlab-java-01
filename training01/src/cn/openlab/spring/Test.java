package cn.openlab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hotspot spot = (Hotspot)ac.getBean("hotspot");
		System.out.println(spot.getC());
		
//		Fishball f = new Fishball();
//		Beaf b = new Beaf();
//		Hotspot h = new Hotspot();
//		h.setBeaf(b);
//		h.setFishball(f);
//		System.out.println(h.getC());
		
	}
}
