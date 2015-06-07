package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ParamArray
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class ParamArray {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북"};
		changeName(strArr);
		for(String name : strArr) {
			System.out.println(name);
		}
	}
	
	private static void changeName(String[] names) {
		for(int i = 0; i < names.length; i++) 
			names[i] = "김" + names[i].substring(1, names[i].length()); 
	}

}
