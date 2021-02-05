package com.example.demo.model;

/**
 * Addition operation
 */
public class AdditionDto extends ArithmeticOperation {

	/**
	 * ParamBuilder
	 */
    public AdditionDto(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    /**
     * Implementation methodd from CommonMethod intertafe
     */
	@Override
	public double execute() {
		// TODO Auto-generated method stub
        return operand1 + operand2;
	}
}

