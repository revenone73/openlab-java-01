package cn.openlab.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import cn.openlab.game.entity.ChatMessage;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
	}
}
