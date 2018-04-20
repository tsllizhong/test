package com.hr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("/test")
	public String test(String name) {
		return "Hello Git"+name;
	}
}
