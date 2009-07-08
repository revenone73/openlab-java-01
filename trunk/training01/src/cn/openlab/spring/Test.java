package cn.openlab.spring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.openlab.hibernate.domain.Gender;
import cn.openlab.spring.dao.GenderDao;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		GenderDao genderDao = (GenderDao)ac.getBean("genderDao");
		List<Gender> gs = genderDao.findAllGenders();
		for(Gender g : gs) {
			System.out.println(g);
		}
	}
}
