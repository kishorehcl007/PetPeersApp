package com.hcl.ing.pet.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.pet.app.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
	
	public Pet findByPetId(Long petId);
	
	public List<Pet> findByUserId(Long userId);

}
