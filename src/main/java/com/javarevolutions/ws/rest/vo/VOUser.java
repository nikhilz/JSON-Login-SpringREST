package com.javarevolutions.ws.rest.vo;

public class VOUser {
	private String username;
	private String password;
	private boolean userValid;
	
	
	
	
	
	
	
	
	public VOUser() {
	}
	public VOUser(String username, String password, boolean userValid) {
		super();
		this.username = username;
		this.password = password;
		this.userValid = userValid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isUserValid() {
		return userValid;
	}
	public void setUserValid(boolean userValid) {
		this.userValid = userValid;
	}
	
	
}
