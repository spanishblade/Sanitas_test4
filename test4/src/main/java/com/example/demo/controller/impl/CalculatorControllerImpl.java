package com.example.demo.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.request.OperationType;
import com.example.demo.api.response.OperationResult;
import com.example.demo.api.response.ResponseBase;
import com.example.demo.controller.CalculatorController;
import com.example.demo.log.Log;
import com.example.demo.model.AdditionDto;
import com.example.demo.model.SubstractionDto;
import com.example.demo.service.CalculatorService;

/**
 * Operations controller implementation
 */
@RestController
public class CalculatorControllerImpl implements CalculatorController{

	@Autowired
	CalculatorService calculatorService;
	
	@Autowired
	Log logger;
	
	/**
	 * Return operation result. GET
	 */
	@Override
	public ResponseEntity<ResponseBase<OperationResult>> getOperationResult(OperationType operationType, double operand1,
			double operand2) {
		
		double result = 0;
		
		logger.setMessage("CALCULATOR_CONTROLLER::getOperationResult");
		logger.setMessage("Input-arguments: OperationType: " + operationType.getName() + " operand1: " + String.valueOf(operand1) + " operand2: " + String.valueOf(operand2));
		
		if (operationType.getSymbol().equals(OperationType.TYPE_ADDITION.getSymbol())) {
			result = calculatorService.executeOperation(new AdditionDto(operand1, operand2));
			logger.setMessage("Operation result: " + String.valueOf(operand2));
			
		}else if (operationType.getSymbol().equals(OperationType.TYPE_SUBSTRACTION.getSymbol())) {
			result = calculatorService.executeOperation(new SubstractionDto(operand1, operand2));
		}
		
		//Esta sería la respuesta, pero al devolver el ResponseEntity completo, no compila.
		//return new ResponseEntity<>(new ResponseBase<>(new OperationResult(result)),HttpStatus.OK);
		return null;
	}
}


