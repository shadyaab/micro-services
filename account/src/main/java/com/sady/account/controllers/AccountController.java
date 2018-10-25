package com.sady.account.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping("/msg")
	public String getMsg(){
		return "Hello !! Inside account micro-service";
	}
}
