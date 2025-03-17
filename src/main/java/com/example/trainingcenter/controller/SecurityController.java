package com.example.trainingcenter.controller;

import com.example.trainingcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Account")
public class SecurityController {
	@Autowired
	public UserService userService;

	@PostMapping("/create")
	public String create(@RequestParam String username,@RequestParam String password,@RequestParam String type) {
		return userService.create(username, password,type);
	}
}
