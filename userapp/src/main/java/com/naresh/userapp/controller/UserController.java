package com.naresh.userapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public List<String> list(){
		List<String> usernames = new ArrayList<>();
		usernames.add("Naresh");
		usernames.add("Prabhu");
		return usernames;
	}
}
