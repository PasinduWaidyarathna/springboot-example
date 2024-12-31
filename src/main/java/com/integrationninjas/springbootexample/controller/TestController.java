package com.integrationninjas.springbootexample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Integration lakindu");
		object.put("email", "integrationninjas@gmail.com");
		return object;
	}

}
