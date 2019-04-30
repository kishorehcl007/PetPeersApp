package com.hcl.pet.app.dto;

import java.io.Serializable;

public class PetRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String petName;
	
	private String place;
	
	private Integer age;
	
	public PetRequest() {
		super();
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PetRequest [petName=");
		builder.append(petName);
		builder.append(", place=");
		builder.append(place);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	
	

}
