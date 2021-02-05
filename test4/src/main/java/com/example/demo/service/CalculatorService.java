package com.example.demo.service;

import com.example.demo.model.ArithmeticOperation;

/**
 * Calculator service interface
 */
public interface CalculatorService {
	
	/**
	 * Method executer ArithmeticOperation 
	 */
	double executeOperation(ArithmeticOperation operation);
}

