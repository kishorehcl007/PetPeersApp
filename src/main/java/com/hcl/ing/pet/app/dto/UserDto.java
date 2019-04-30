package com.hcl.ing.pet.app.dto;

public class UserDto {
	
	private long id;
	private String emailId;
	private String password;
	private String confrmPassword;
	private String userName;
	private String address;
	private String contactDetails;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	

	public UserDto() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfrmPassword() {
		return confrmPassword;
	}
	public void setConfrmPassword(String confrmPassword) {
		this.confrmPassword = confrmPassword;
	}

}
