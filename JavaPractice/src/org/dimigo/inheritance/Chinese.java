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
public class Chinese extends Person {
	@Override
	public void sayHello () {
		System.out.println("니하오");
	}

	@Override
	public void sayBye () {
		System.out.println("짜이찌엔");
	}
}
