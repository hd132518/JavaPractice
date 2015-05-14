package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ArrayBasic2
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 15.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class ArrayBasic2 {

	public static void main (String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		int[] intArr1 = new int[] {1, 2, 3, 4, 5};
		
		for (int value : new int[]{1, 2, 3, 4, 5}) {
			System.out.println(value + " | ");
		}
		System.out.println();
	}
}
