package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {

	@GetMapping("display")
	public String show() {
		return "welcome";
	}
}
