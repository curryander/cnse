package com.cnse.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("application.properties")
public class ConfigTest {
	
	private final Properties properties;
	
	@Value("${start.controller.message}")
	String message = "default";
	
	String message2;
	
	@Autowired
	ConfigTest(@Value("${start.port}") String message2, Properties properties){
		this.message2 = message2;
		this.properties = properties;
		//this.message = "Hello Default";
	}

	
	ConfigTest(String m1, String m2){
		System.out.println(m1 + m2);
		this.properties = null;
	}
	
	
	@GetMapping("/configtest")
    public String greetings() {
        return "Hi from the " + message;
    }
	
	@GetMapping("/inject")
	public String greetings2() {
		return "Hi this " + message2 + " is injected";
	}
	
	@GetMapping("/newinjections")
	public String printinjections() {
		return "ControllerLog: " + properties.getLog() + ", ControllerMessage: "+ properties.getMessage() + ", ManagementEndpoints: "+ properties.getManagementendpoints() + ", Serverport: "+ properties.getPort();
	}
	}


