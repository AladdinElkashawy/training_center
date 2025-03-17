package com.example.trainingcenter.entity;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sec_user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users implements UserDetails {
	
	@Getter
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String username;
	
    private String password;
	
	private String authorities;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.stream(this.authorities.split(","))
				.map(role -> new SimpleGrantedAuthority("ROLE_" + role.trim()))
				.collect(Collectors.toList());
	}
}
