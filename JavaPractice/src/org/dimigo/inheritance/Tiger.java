package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Tiger
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Tiger extends Animal {

	/**
	 * @param name
	 */
	public Tiger (String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		System.out.println("어흥");
	}
}
