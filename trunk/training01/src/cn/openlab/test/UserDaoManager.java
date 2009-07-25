package cn.openlab.test;

public class UserDaoManager {

	public static UserDAO getDao() {
		try {
			Class c = Class.forName(TYPE);
			UserDAO o = (UserDAO) c.newInstance();
			return o;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String TYPE;
}
