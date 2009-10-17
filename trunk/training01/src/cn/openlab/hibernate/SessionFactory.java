package cn.openlab.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactory {

	public static Session createSession() {
		Configuration cfg = new Configuration().configure();
		return cfg.buildSessionFactory().openSession();
	}
}
