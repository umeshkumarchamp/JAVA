package com.model;

public class User {

	private int user_id; 
	private String user_name; 
	private String email; 
	private String mobile;
	public User(int user_id, String user_name, String email, String mobile) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.mobile = mobile;
	}
	
	public User() {

	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", mobile=" + mobile
				+ "]";
	} 
	
	
	
}
