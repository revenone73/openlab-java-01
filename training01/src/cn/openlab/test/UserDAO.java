package cn.openlab.test;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	private ArrayList<User> users = new ArrayList<User>();

	public void add(User u) throws InvalidUserException {
		if(u != null) {
			Integer id = u.getId();
			if(id == null) {
				throw new InvalidUserException();
			}
			User user = findById(id);
			if(user == null) {
				users.add(u);
			} else {
				updateUserById(user);
			}
		}
	}

	public User findById(int id) {
		int i = getIndexOfUserId(id);
		if(i != -1) {
			return users.get(i);
		}
		return null;
	}

	private int getIndexOfUserId(int userId) {
		for(int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if(u.getId().intValue() == userId) {
				return i;
			}
		}
		return -1;
	}
	
	public void updateUserById(User u) {
		Integer id = u.getId();
		int index = getIndexOfUserId(id);
		if(index != -1) {
			users.set(index, u);
		}
	}

	public void deleteById(int id) {
		int index = getIndexOfUserId(id);
		if(index != -1) {
			users.remove(index);
		}
	}

	public List<User> findAll() {
		return users;
	}
	
	public List<User> findByCondition(User cond) {
		List<User> list = new ArrayList<User>();
		for(User u : users) {
			if(match(u, cond) ){
				list.add(u);
			}
		}
		return list;
	}

	private boolean match(User user, User condition) {
		if(condition != null) {
			Integer id = condition.getId();
			if(id != null) {
				if(!user.getId().equals(id)) {
					return false;
				}
			}
			String name = condition.getName();
			if(name != null) {
				if(!name.equals(user.getName())) {
					return false;
				}
			}
			String password = condition.getPassword();
			if(password != null) {
				if(!password.equals(user.getPassword())) {
					return false;
				}
			}
			Integer age = condition.getAge();
			if(age != null) {
				if(!age.equals(user.getAge())) {
					return false;
				}
			}
		}
		return true;
	}

	public List<User> findUsersByName(String name) {
		List<User> list = new ArrayList<User>();
		
		for(User u : users) {
			if(u.getName().contains(name)) {
				list.add(u);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		dao.findByCondition(null);
	}
}
