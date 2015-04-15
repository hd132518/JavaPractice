package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_Car2
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 16.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3() {
		
	}

	
	/**
	 * @param company
	 * @param model
	 * @param color
	 * @param maxSpeed
	 * @param price
	 */
	public Car3 (String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}


	/**
	 * @param company
	 * @param model
	 * @param color
	 * @param maxSpeed
	 */
	public Car3 (String company, String model, String color, int maxSpeed) {
		this(company, model, color, maxSpeed, 0);
	}


	/**
	 * @param company
	 * @param model
	 * @param color
	 */
	public Car3 (String company, String model, String color) {
		this(company, model, color, 0);
	}


	public String getCompany () {
		return company;
	}

	public void setCompany (String company) {
		this.company = company;
	}

	public String getModel () {
		return model;
	}

	public void setModel (String model) {
		this.model = model;
	}

	public String getColor () {
		return color;
	}

	public void setColor (String color) {
		this.color = color;
	}

	public int getMaxSpeed () {
		return maxSpeed;
	}

	public void setMaxSpeed (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPrice () {
		return price;
	}

	public void setPrice (int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("제조사명: "+company);
		System.out.println("모델명: "+model);
		System.out.println("색상: "+color);
		System.out.println("최대속도: "+maxSpeed);
		System.out.printf("가격 : %,d원\n\n", price);
	}
	
}
