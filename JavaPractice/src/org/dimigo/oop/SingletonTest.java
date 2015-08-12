package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_SingletonTest
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 18.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class SingletonTest {

	public static void main (String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}
}
