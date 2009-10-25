package cn.openlab.hibernate;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, false);
	}
}
