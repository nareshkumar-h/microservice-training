package com.naresh.accountservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {

	
	@GetMapping
	public List<Integer> accounts(){
		List<Integer> accounts = new ArrayList<>();
		accounts.add(10001);
		accounts.add(10002);
		return accounts;
	}
}
