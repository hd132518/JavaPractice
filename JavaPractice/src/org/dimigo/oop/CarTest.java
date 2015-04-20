
package org.dimigo.oop;

/** <pre>
 * org.dimigo.basic
 * 	|_CarTest
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class CarTest {

	public static void main (String[] args) {

		/*
		Car car1 = new Car();
		car1.setModel("제네시스");
		car1.setMaxSpeed(225);
		car1.setColor("검정색");
		car1.setPrice(500000000);
		car1.setCompany("현대자동차");
		
		Car car2 = new Car();
		car2.setModel("K7");
		car2.setMaxSpeed(246);
		car2.setColor("흰낵");
		car2.setPrice(400000000);
		car2.setCompany("기아자동차");

		Car car3 = new Car();
		car2.setModel("SM7");
		car2.setMaxSpeed(200);
		car2.setColor("회낵");
		car2.setPrice(380000000);
		car2.setCompany("삼성자동차");

		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
		*/
		/*
		Car2 car1 = new Car2("현대자동차", "제네시스", "점정색", 225, 50000000);

		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);

		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 3800000);

		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
		*/
		
		Car3 car1 = new Car3("현대자동차", "제네시스", "점정색", 225, 50000000);

		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);

		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");

		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
		
		
	}
}
