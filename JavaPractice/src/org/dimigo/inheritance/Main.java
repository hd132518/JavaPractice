package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Main
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 19.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		long time2 = System.currentTimeMillis();
		StringBuffer b = new StringBuffer();
		for(int i = 0; i < 1000000; i++) b.append("hello ");
		System.out.println(System.currentTimeMillis() - time2);
		
		long time = System.currentTimeMillis();
		String a = "";
		for(int i = 0; i < 1000000; i++) a += "hello ";
		System.out.println(System.currentTimeMillis() - time);

		System.out.println("dsfds");
	}

}
