package com.as.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String root() {
		return "Welcome To Ahmed Saleh AWS App";
	}

}
