package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_CarTest2
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class CarTest2 {

	public static void main (String[] args) {
		Car2.setCompany("현대");
		
		Car2[] cars = {
			new Car2("제네시스"), new Car2("그랜쟈"), new Car2("람보르기니")
		};
		
		for(Car2 car : cars) {
			car.printCar();
		}
	}
}
