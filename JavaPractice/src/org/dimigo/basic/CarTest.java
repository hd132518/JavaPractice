package org.dimigo.basic;


/**
 * <pre>
 * org.dimigo.basic
 * 	|_CarTest
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class CarTest {

	public static void main (String[] args) {
		Car car1 = new Car("제네시스", 225, "점정색", 50000000, "현대자동차");
		
		Car car2 = new Car("K7", 246, "흰색", 40000000, "기아자동차");
		
		Car car3 = new Car("SM7", 200, "회색", 3800000, "삼성자동차");
		
		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
	}
}
