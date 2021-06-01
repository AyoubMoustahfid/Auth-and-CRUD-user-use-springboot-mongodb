package com.smart_transformation.app_helloSign_springboot.request;

public class UserLoginRequest {
	
	private String email;
	private String password;
	
	
	// Public Method Generate Getter and Setter Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Public Method Generate Getter and Setter Password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
