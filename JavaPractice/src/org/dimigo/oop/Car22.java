package org.dimigo.oop;

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
public class Car22 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car22() {
		
	}

	/**
	 * @param company 제조사이름
	 * @param model 모델명
	 * @param color 색상
	 * @param maxSpeed 최고속력
	 * @param price 가격
	 */
	public Car22 (String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
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
