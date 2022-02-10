package model;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */
public class SimpleCalculator {
	private int num1;
	private int num2;
	private int numResult;
	
	
	public SimpleCalculator() { //default constructor
		super();
	}
	public SimpleCalculator(int num1, int num2) { //non-default constructor
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	//getters and setters
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @return the numResult
	 */
	public int getNumResult() {
		return numResult;
	}
	/**
	 * @param numResult the numResult to set
	 */
	public void setNumResult(int numResult) {
		this.numResult = numResult;
	}
	@Override
	public String toString() {
		return "simpleCalculator [num1=" + num1 + ", num2=" + num2 + ", numResult=" + numResult + "]";
	}
	
	public void sumCalculator() { //calculates the sum of two numbers
		this.numResult = num1 + num2;
		
	}
	public void productCalculator() { //calculates the product of two numbers
		this.numResult = num1 * num2;
		
	}
	
}
