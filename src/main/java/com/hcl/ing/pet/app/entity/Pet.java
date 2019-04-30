package com.hcl.ing.pet.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PET_INFO")
public class Pet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long petId;
	
	@Column(name="PET_NAME")
	private String petName;
	
	@Column(name = "PLACE")
	private String place;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name="AVAILABILITY")
	private Character availability;
	
	@Column(name = "USER_ID")
	private Long userId;
	
	public Pet() {
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

	public Character getAvailability() {
		return availability;
	}

	public void setAvailability(Character availability) {
		this.availability = availability;
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
		builder.append(", availability=");
		builder.append(availability);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}

	
	

}
