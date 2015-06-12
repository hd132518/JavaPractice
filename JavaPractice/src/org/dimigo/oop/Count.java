package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Cound
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 11.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Count {

	private static int count = 0;
	
	public Count() {
		count++;
	}
	
	public static int getCount() {
		int $ = 3;
		int _ = $ + 3;
		return count;
	}
}
