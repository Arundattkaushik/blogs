package entities;

import java.sql.Timestamp;

public class User {
	
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userGender;
	private Timestamp createTime;
	private String userProfile;
	
	
	
	
	public User() {
		
	}

	public User(int userId, String userName, String userEmail, String userPassword, String userGender,
			Timestamp createTime, String userProfile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.createTime = createTime;
		this.userProfile = userProfile;
	}
	
	
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public User(int userId, String userName, String userEmail, String userPassword, String userGender, Timestamp createTime) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.createTime = createTime;
	}
	public User(String userName, String userEmail, String userPassword, String userGender) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
	}

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
