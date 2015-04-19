package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_Car
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 6.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Car {
	private String model;
	private int maxSpeed;
	private String color;
	private int price;
	private String company;
	
	public Car() {
		
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel () {
		return model;
	}

	public void setModel (String amodel) {
		model = amodel;
	}

	public int getMaxSpeed () {
		return maxSpeed;
	}

	public void setMaxSpeed (int amaxSpeed) {
		maxSpeed = amaxSpeed;
	}

	public String getColor () {
		return color;
	}

	public void setColor (String acolor) {
		color = acolor;
	}

	public int getPrice () {
		return price;
	}

	public void setPrice (int aprice) {
		price = aprice;
	}

	public void setCompany (String acompany) {
		company = acompany;
	}

	public void forward(int speed) {
		System.out.println("부릉부릉 땅크나가신다!!");
	}
	
	public void backward(int speed) {
		System.out.println("후진합니다");
	}
	
	public boolean stop() {
		System.out.println("멈춤니다");
		return true;
	}
	
	public void turnLeft(float angle) {
		System.out.println(angle+"도 만큼 왼쪽으로 회전");
	}
	
	public void turnRight(float angle) {
		System.out.println(angle+"도 만큼 오른쪽으로 회전");
	}
	
	public void print() {
		System.out.println("제조사명: "+company);
		System.out.println("모델명: "+model);
		System.out.println("색상: "+color);
		System.out.println("최대속도: "+maxSpeed);
		System.out.printf("가격 : %,d원\n\n", price);
	}
}
