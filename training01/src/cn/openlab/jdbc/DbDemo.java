package cn.openlab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class DbDemo {

	public static void main(String[] args) throws Exception {
		saveUser("google", 1, new Timestamp(System.currentTimeMillis()));
	}

	public static void saveUser(String name, int gender, Timestamp dateOfBirth) throws Exception {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into students (name, gender, date_of_birth) values (?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, gender);
		ps.setTimestamp(3, dateOfBirth);
		ps.execute();
		ps.close();
		conn.close();
	}

	public static void updateUser(int id, String newName) throws Exception {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("update students set name=? where id=?");
		ps.setString(1, "william");
		ps.setInt(2, 1);
		ps.execute();
		ps.close();
		conn.close();
	}

	public static void getUser(int id) throws Exception {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from students where id = ?");
		ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		if(rs != null) {
			while(rs.next()) {
				int no = rs.getInt("id");
				String name = rs.getString("name");
				Timestamp dateOfBirth = rs.getTimestamp("date_of_birth");
				int gender = rs.getInt("gender");
				System.out.println("ID:" + no + ",name:" + name + ",gender:" + gender + ",Date of birth:" + dateOfBirth);
				
			}
		}
	}

	public static Connection getConnection() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=java_demo;user=sa;password=1111";
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}

	public static void deleteUser(int id) throws Exception {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("delete students where id = ?");
		ps.setInt(1, id);
		ps.execute();
		ps.close();
		conn.close();
	}
}
