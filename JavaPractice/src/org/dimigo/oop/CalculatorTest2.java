package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_CalculatorTest2
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 11.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class CalculatorTest2 {

	public static void main (String[] args) {
		int n1 = 10, n2 = 20;
		
		Calculator2 calc = new Calculator2();
		
		// 인스턴스 메서드 호출
		calc.powerOn();
		
		System.out.println("10 + 20 = "+Calculator2.add(n1, n2));
		System.out.println("10 - 20 = "+Calculator2.sub(n1, n2));
		System.out.println("10 * 20 = "+Calculator2.mul(n1, n2));
		System.out.println("10 / 20 = "+Calculator2.div(n1, n2));
		
		
		calc.powerOff();
	}
}
