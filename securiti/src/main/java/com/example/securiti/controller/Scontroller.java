package com.example.securiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scontroller {
	@GetMapping("/display")
	public String welcome() {
		return("<h1>Welcome to spring boot security</h1>");
	}

}
