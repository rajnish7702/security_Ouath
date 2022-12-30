package com.outh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth {
	@GetMapping("/")
	public String home() {
		return "Home Page ";
	}
}
