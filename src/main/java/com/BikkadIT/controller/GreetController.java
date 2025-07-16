package com.BikkadIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greetMsg")
	public String greetMsg() {
		String msg = "Good morning";
		return msg;

	}
	
	@GetMapping("/greetMsg1")
	public String greetMsg1() {
		String msg = "Good night";
		return msg;
	}
}
