package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot 2.0!";
	}

}