package com.cnse.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Hello World";
	}

}
