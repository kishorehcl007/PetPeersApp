package com.hcl.pet.app.dto;

import java.io.Serializable;

public class PetBuyRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long userId;
	
	private Long petId;
	
	public PetBuyRequest() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PetBuyRequest [userId=");
		builder.append(userId);
		builder.append(", petId=");
		builder.append(petId);
		builder.append("]");
		return builder.toString();
	}

	
}
