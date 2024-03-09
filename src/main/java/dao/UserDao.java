package dao;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Posts;
import entities.User;

public class UserDao {

	private Connection con;
	public Boolean status = false;

	public UserDao(Connection con) {
		this.con = con;
	}
	
	public Boolean saveUser(User user) {
		
		try {
			String query = "insert into users (userName, userEmail, userPassword, userGender) value(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserEmail());
			pstmt.setString(3, user.getUserPassword());
			pstmt.setString(4, user.getUserGender());
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public User getUserByEmailAndPassword(String email, String password) {
		User user = null;
		
		try {
			String query = "select * from users where userEmail=? and userPassword=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet set = pstmt.executeQuery();
			if (set.next()) {
				user = new User();
				user.setUserId(Integer.valueOf(set.getString("userId")));
				user.setUserName(set.getString("userName"));
				user.setUserEmail(set.getString("userEmail"));
				user.setUserPassword(set.getString("userPassword")); 
				user.setUserGender(set.getString("userGender")); 
				user.setUserProfile(set.getString("userProfile"));
				user.setCreateTime(set.getTimestamp("createTime"));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
}
