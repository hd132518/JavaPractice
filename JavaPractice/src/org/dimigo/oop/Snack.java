package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Snack
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Snack {

	private String name;
	private String company;
	private int price;
	private int number;
	
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	public Snack (String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	public Snack () {
	}

	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getCompany () {
		return company;
	}
	public void setCompany (String company) {
		this.company = company;
	}
	public int getPrice () {
		return price;
	}

	public void setPrice (int price) {
		this.price = price;
	}

	public int getNumber () {
		return number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public void printSnack() {
		System.out.println("이름 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println(String.format("가격 : %,d원", price));
		System.out.println("개수 : "+number+"개");
	}
	
	public int calcPrice () {
		return number * price;
	}
}
