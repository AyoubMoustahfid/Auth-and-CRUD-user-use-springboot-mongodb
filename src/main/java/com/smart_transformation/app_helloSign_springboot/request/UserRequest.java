package com.smart_transformation.app_helloSign_springboot.request;

public class UserRequest {

	
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String password;
	
	
	// Public Method Generate Getter and Setter firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Public Method Generate Getter and Setter lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Public Method Generate Getter and Setter Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Public Method Generate Getter and Setter email
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Public Method Generate Getter and Setter email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Public Method Generate Getter and Setter password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
