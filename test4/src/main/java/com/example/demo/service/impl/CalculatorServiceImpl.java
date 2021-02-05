package com.example.demo.service.impl;

import com.example.demo.model.ArithmeticOperation;
import com.example.demo.service.CalculatorService;

/**
 * Calculator service implementation 
 */
public class CalculatorServiceImpl implements CalculatorService {

	/**
	 * Method executer ArithmeticOperation 
	 */
	@Override
	public double executeOperation(ArithmeticOperation arithmeticOperation) {
		return arithmeticOperation.execute();
	}
}
