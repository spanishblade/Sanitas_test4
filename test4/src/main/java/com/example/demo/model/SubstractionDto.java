package com.example.demo.model;

/**
 * Substraction Operation
 */
public class SubstractionDto extends ArithmeticOperation {

	/**
	 * ParamBuilder
	 */
    public SubstractionDto(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    
    /**
     * Implementation method from CommonMethod interface
     */
	@Override
	public double execute() {
		// TODO Auto-generated method stub
        return operand1 - operand2;
	}
}
