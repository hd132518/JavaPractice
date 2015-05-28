package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_MultiArray
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 21.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class MultiArray {

	public static void main (String[] args) {
		int[][] arr = new int [2][3];
		
		for (int[] is : arr) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		
		String[][] strArr = new String[2][];
		
		strArr[0] = new String[]{"C", "Java", "C++"};
		strArr[1] = new String[]{"PHP", "JSP", "python"};
	}
}
