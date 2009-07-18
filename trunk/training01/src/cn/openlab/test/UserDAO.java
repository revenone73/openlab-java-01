package cn.openlab.test;

import java.util.List;

public interface UserDAO {


	public void add(User u) throws InvalidUserException, UserDuplicationException;

	public User findById(int id);
	
	public void updateUserById(User u);

	public void deleteById(int id);

	public List<User> findAll();
	
	public List<User> findByCondition(User cond);
	public List<User> findUsersByName(String name) ;
}
