package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_CalculatorTest
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 5.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		Calculator calc = new Calculator(10, 20);
		calc.powerOn();
		
		System.out.println("10 + 20 = "+calc.add());
		System.out.println("10 - 20 = "+calc.sub());
		System.out.println("10 * 20 = "+calc.mul());
		System.out.println("10 / 20 = "+calc.div());
		calc.powerOff();

	}

}
