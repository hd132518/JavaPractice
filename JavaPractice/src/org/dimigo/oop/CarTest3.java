
package org.dimigo.oop;

/** <pre>
 * org.dimigo.oop
 * 	|_CarTest3
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 20.
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class CarTest3 {
	public static void main (String[] args) {
		Car3 car1 = new Car3("현대자동차", "제네시스", "점정색", 225, 50000000);

		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);

		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");

		System.out.println("<< 자동차 목록 >>");
		car1.print();
		car2.print();
		car3.print();
	}
}
