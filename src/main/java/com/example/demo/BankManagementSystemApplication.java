package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class BankManagementSystemApplication {

	
	@RestController
	@RequestMapping(value = "/api/users")
	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
	}

}
