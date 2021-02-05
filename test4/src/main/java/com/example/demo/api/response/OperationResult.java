package com.example.demo.api.response;

/**
 * Operation Result response object.
 */
public class OperationResult {

	private final double result;

	
	public OperationResult(double result){
		this.result = result;
	}
	
	public OperationResult() {
		this.result = 0;
	}

	public double getResult() {
		return result;
	}
}
