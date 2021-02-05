package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.CalculatorController;

@SpringBootApplication
public class Test4Application {

	@Autowired
	private CalculatorController calculatorController;
	
	public static void main(String[] args) {
		SpringApplication.run(Test4Application.class, args);
		
	}

}
