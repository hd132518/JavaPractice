package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Car2
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Car2 {
	
	public Car2(String name) {
		this.name = name;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	private static String company;
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Car2.company = company;
	}
	
	public void printCar() {
		System.out.println(name + ", " + company);
	}
	public void printCar2() {
		System.out.println(this.getName() + ", " + getCompany());
	}
	
	public static void  printCar3(Car2 car) {
		System.out.println(car.name + ", " + company);
	}
	
	public static void printCar4(Car2 car) {
		System.out.println(car.name + ", " + getCompany());
	}

}
