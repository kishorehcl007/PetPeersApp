package com.hcl.pet.app.dto;

import java.io.Serializable;
import java.util.List;

public class MyPetsResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<PetDto> petList;
	
	public MyPetsResponse() {
	}

	public List<PetDto> getPetList() {
		return petList;
	}

	public void setPetList(List<PetDto> petList) {
		this.petList = petList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyPetsResponse [petList=");
		builder.append(petList);
		builder.append("]");
		return builder.toString();
	}

	
}
