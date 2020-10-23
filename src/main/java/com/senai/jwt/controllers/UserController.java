package com.senai.jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/home")
	public String home() {
		return "Hello Worl";
	}
	
	@RequestMapping("/users")
	@ResponseBody
	public String getUsers() {
		return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"},"
				+ "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
	}
}
