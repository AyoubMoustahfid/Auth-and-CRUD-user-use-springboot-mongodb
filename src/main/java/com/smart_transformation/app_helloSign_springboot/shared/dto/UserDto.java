package com.smart_transformation.app_helloSign_springboot.shared.dto;

import java.io.Serializable;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

public class UserDto implements Serializable {

	private static final long serialVersionUID = -413352701059587959L;
	
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;

	
	// Public Method Generate Getter and Setter ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
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
	
	// Public Method Generate Getter and Setter phone
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
	
	// Public Method Generate Getter and Setter Encrypted Password
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	// Public Method Generate Getter and Setter email Verification Token
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	
	// Public Method Generate Getter and Setter Email Verification Status
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	
	
}
