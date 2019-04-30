package com.hcl.ing.pet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.pet.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
