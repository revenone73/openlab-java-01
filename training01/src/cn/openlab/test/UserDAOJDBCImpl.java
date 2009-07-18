package cn.openlab.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 没有处理异常、资源清理等
 * 没有处理sql注入
 * @author johnny
 *
 */
public class UserDAOJDBCImpl implements UserDAO {

	@Override
	public void add(User u) throws InvalidUserException,
			UserDuplicationException {
		String sql = "insert into USERS(NAME, AGE, PASSWORD) VALUES(?,?,?)";
		Connection conn;
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getName());
			ps.setInt(2, u.getAge());
			ps.setString(3, u.getPassword());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(int id) {
		String sql = "delete USERS where ID=?";
		Connection conn;
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from users";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					int id = rs.getInt("ID");
					String name = rs.getString("NAME");
					String password = rs.getString("PASSWORD");
					int age = rs.getInt("AGE");
					User user = new User();
					user.setId(id);
					user.setAge(age);
					user.setName(name);
					user.setPassword(password);
					users.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<User> findByCondition(User cond) {
		List<User> users = new ArrayList<User>();
		Connection conn;
		try {
			conn = getConnection();
			String sql = "select * from USERS where 1=1 ";
			if(cond != null) {
				Integer id = cond.getId();
				if(id != null) {
					sql += " and id=" + id;
				}
				String name = cond.getName();
				if(name != null) {
					sql += " and name = '" + name + "'";
				}
				Integer age = cond.getAge();
				if(age != null) {
					sql += " and age = " + age;
				}
				String password = cond.getPassword();
				if(password != null) {
					sql += " and password ='" + password + "'";
				}
			}
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					User u = new User();
					u.setId(rs.getInt("ID"));
					u.setName(rs.getString("NAME"));
					u.setAge(rs.getInt("AGE"));
					u.setPassword(rs.getString("PASSWORD"));
					users.add(u);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public User findById(int id) {
		try {
			PreparedStatement ps = getConnection().prepareStatement("select * from users where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					User user = new User();
					user.setId(rs.getInt("ID"));
					user.setAge(rs.getInt("AGE"));
					user.setName(rs.getString("NAME"));
					user.setPassword(rs.getString("PASSWORD"));
					return user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findUsersByName(String name) {
		List<User> users = new ArrayList<User>();
		Connection conn;
		try {
			conn = getConnection();
			String sql = "select * from USERS where NAME=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					User u = new User();
					u.setAge(rs.getInt("AGE"));
					u.setName(rs.getString("NAME"));
					u.setPassword(rs.getString("PASSWORD"));
					users.add(u);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public void updateUserById(User u) {
		User temp = findById(u.getId());
		if(temp != null) {
			Connection conn;
			try {
				conn = getConnection();
				String sql = "update USERS set NAME=?, AGE=?, PASSWORD=? where ID=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, u.getName());
				ps.setInt(2, u.getAge());
				ps.setString(3, u.getPassword());
				ps.setInt(4, u.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	private Connection getConnection() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=java;user=sa;password=1111";
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}

	public static void main(String[] args) throws InvalidUserException, UserDuplicationException {
		User u = new User();
		u.setAge(32);
		u.setName("jiabao1");
		u.setPassword("g' OR '1'='1");//SQL Injection
		UserDAO dao= new UserDAOJDBCImpl();
		List<User> users = dao.findByCondition(u);
		for(User user : users) {
			System.out.println(user);
		}
	}
}
