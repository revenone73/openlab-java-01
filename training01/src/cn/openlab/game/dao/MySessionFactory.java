package cn.openlab.game.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {

	private final static SessionFactory factory;
	static {
		Configuration cfg = new AnnotationConfiguration().configure();
		factory = cfg.buildSessionFactory();
	}

	public static Session createSession() {
		return factory.openSession();
	}
}
