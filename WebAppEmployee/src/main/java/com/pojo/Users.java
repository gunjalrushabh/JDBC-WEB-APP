package com.pojo;

public class Users {
	// userId | userName | userPassword
	private int userId;
	private String userEamil;
	private String userPassword;
	
	
	
	public Users(int userId, String userEamil, String userPassword) {
		super();
		this.userId = userId;
		this.userEamil = userEamil;
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEamil() {
		return userEamil;
	}
	public void setUserEamil(String userEamil) {
		this.userEamil = userEamil;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userEamil=" + userEamil + ", userPassword=" + userPassword + "]";
	}
	
}
