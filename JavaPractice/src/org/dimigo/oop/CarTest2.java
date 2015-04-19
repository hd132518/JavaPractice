
package org.dimigo.oop;

/** <pre>
 * org.dimigo.oop
 * 	|_CarTest2
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 20.
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class CarTest2 {
	public static void main (String[] args) {

		Car2 car1 = new Car2("현대자동차", "제네시스", "점정색", 225, 50000000);

		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);

		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 3800000);

		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
	}
}
