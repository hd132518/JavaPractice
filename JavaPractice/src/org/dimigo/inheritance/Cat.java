package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Cat
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Cat extends Animal {

	/**
	 * @param name
	 */
	public Cat (String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		System.out.println("야옹");
	}
}
