package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Calculator
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 5.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Calculator {

	private int num1;
	private int num2;
	
	public Calculator () {
		
	}
	/**
	 * @param num1
	 * @param num2
	 */
	public Calculator (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public int add() {
		return num1 + num2;
	}
	
	public int sub() {
		return num1 - num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public double div() {
		return ((double) num1) / num2;
	}
}
