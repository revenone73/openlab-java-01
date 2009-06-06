package cn.openlab.test2;

import java.util.ArrayList;

public class Users {

	private static ArrayList allUsers = new ArrayList();

	public void add(User u) {
		
	}

	public User findById(int id) {
		
		return null;
	}

	public ArrayList findByConditon(User u) {
		if(u.getId() != 0) {
			
		}
		if(u.getAddress() != null) {
			
		}
		return null;
	}

	public void updateUsrById(User u) {
		int id = u.getId();
		User u2 = findById(id);
		u2.setAddress(u.getAddress());
		u2.setCode(u.getCode());
	}

	public void deleteById(int id) {
		
	}

	public ArrayList findUserByName(String name) {
		return null;
	}
}
