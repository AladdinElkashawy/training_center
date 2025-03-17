package com.example.trainingcenter.repository;

import com.example.trainingcenter.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	public UserDetails findByUsername(String username);
}
