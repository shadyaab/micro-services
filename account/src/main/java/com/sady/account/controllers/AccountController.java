package com.sady.account.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private Environment env;
	
	@RequestMapping("/msg")
	public String getMsg(){
		return "Hello !! Inside account micro-service : " + env.getProperty("spring.datasource.driver-class-name");
	}
}
