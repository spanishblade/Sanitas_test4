package com.example.demo.api.request;

/**
 * Operation Type enum request object with available arithmetic operations. 
 */
public enum OperationType {

    TYPE_ADDITION("+", "ADDITION"),
    TYPE_SUBSTRACTION("-", "SUBSTRACTION");

	private String symbol;
	private String name;

    OperationType(String symbol, String name) {
		this.setSymbol(symbol);
		this.setName(name);
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
