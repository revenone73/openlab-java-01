package cn.openlab.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 没有处理异常、链接等
 * @author johnny
 *
 */
public class UserDAOJDBCImpl implements UserDAO {

	@Override
	public void add(User u) throws InvalidUserException,
			UserDuplicationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserById(User u) {
		// TODO Auto-generated method stub

	}

	private Connection getConnection() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=java;user=sa;password=1111";
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}

	public static void main(String[] args) {
		UserDAO dao = new UserDAOJDBCImpl();
		User u = dao.findById(2);
		if(u != null) {
			System.out.println(u);
		}
	}
}
