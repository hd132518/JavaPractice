package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ArrayCopy
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 29.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class ArrayCopy {

	public static void main (String[] args) {
		int[] intSrc = {1, 2, 3, 4, 5};
		int[] intDest = new int[10];
		
		System.arraycopy(intSrc, 0, intDest, 0, intSrc.length);
		for(int i : intDest) System.out.println(i);
		
		System.out.println(intDest.toString());
		
		System.out.println(Arrays.equals(intSrc, intDest));
	}
}
