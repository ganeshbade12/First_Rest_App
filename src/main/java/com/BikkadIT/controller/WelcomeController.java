package com.BikkadIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welMsg")
	public String welMsg() {
		String msg = "Welcome to BikkadIT Pune";
		return msg;

	}

	@GetMapping("/welMsg1")
	public String welMsg1() {
		String msg = "Welcome to BikkadIT Sambhajinagar";
		return msg;

	}

}
