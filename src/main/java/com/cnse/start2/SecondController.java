package com.cnse.start2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@GetMapping("/hallo")
    public String sayHello() {
        return "Hello from the second controller!";
    }

}
