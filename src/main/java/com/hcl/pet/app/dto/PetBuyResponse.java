package com.hcl.pet.app.dto;

import java.io.Serializable;

public class PetBuyResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public PetBuyResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PetBuyResponse [message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	

}
