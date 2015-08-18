package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Animal
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public void sleep() {
		System.out.println("쿨쿨");
	}
	
	public void bark() {
		System.out.println("멍멍");
	}

	@Override
	public String toString () {
		return "제 이름은 "+name+"이입니다";
	}
	
	
}
