package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Korean
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Japanese extends Person {
	
	@Override
	public void sayHello () {
		System.out.println("곤니찌와");
	}

	@Override
	public void sayBye () {
		System.out.println("사요나라");
	}
}
