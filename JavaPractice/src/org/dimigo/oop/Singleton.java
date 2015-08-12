package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Singleton
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 18.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Singleton {

	private static boolean isExist = false;
	private static Singleton instance;
	
	public synchronized static Singleton getInstance() {
		if(!isExist) 
			instance = new Singleton();
		return instance;
	}
	
	private Singleton() {
		isExist = true;
	}
}
