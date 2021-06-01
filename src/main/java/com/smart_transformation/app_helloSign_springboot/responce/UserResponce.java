package com.smart_transformation.app_helloSign_springboot.responce;


public class UserResponce {

	private String userId;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	
	// Public Method Generate Getter and Setter User Id
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	
	// Public Method Generate Getter and Setter Phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Public Method Generate Getter and Setter Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}