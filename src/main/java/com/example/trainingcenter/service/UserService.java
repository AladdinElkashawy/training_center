package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Users;
import com.example.trainingcenter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username);
	}
	public String create(String username,String password,String type) {
		Users user=Users.builder()
				.username(username)
				.password(new BCryptPasswordEncoder().encode(password))
				.authorities(type).build();
		userRepository.save(user);
		return "user created successfully";
	}
}
