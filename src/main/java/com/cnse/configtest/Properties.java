package com.cnse.configtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
@ConfigurationProperties(prefix = "start")
public class Properties {
	private int port;
	private String include;
	private String message;
	private String log;
	
	
	
	
	
	public String getManagementendpoints() {
		return include;
	}

	public void setManagementendpoints(@Value("${management.endpoints.web.exposure.include}") String include) {
		this.include = include;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(@Value("${start.controller.message}") String message) {
		this.message = message;
	}

	public String getLog() {
		return log;
	}

	public void setLog(@Value("${start.controller.log}") String log) {
		this.log = log;
	}

	public int getPort() {
		return port;
	}
	
	public void setPort(@Value("${start.port}")int port) {
		this.port = port;
	}
	
	
	

}
