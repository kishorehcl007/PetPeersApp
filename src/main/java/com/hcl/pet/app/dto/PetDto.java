package com.hcl.pet.app.dto;

import java.io.Serializable;

public class PetDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long petId;
	
	private String petName;
	
	private String place;
	
	private Integer age;
	
	private Long userId;
	
	public PetDto() {
		super();
	}

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pet [petId=");
		builder.append(petId);
		builder.append(", petName=");
		builder.append(petName);
		builder.append(", place=");
		builder.append(place);
		builder.append(", age=");
		builder.append(age);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}
	

}
