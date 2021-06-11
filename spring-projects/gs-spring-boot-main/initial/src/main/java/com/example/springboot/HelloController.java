package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController // ready for use by Spring MVC to handle web request
public class HelloController {

	@RequestMapping("/") // maps / to the index() method
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
