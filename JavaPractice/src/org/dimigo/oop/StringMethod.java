package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_StringMethod
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class StringMethod {
	public static void main (String[] args) {
		//           01234567890123
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		System.out.println(s.indexOf("C"));
		System.out.println(s.charAt(7));
		System.out.println(s.concat("ABC"));
		System.out.println("["+"     ABC     ".trim()+"]");
	}
}
