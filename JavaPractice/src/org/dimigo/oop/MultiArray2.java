package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_MultiArray2
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class MultiArray2 {

	public static void main (String[] args) {
		int [][] intArr = {
			{1, 2, 3, 4},
			{4, 5, 6}
		};
		// 초기화된 값을 출력해보자.
		for(int[] arr : intArr) {
			for(int a : arr) {
				System.out.println(a);
			}
			System.out.println();
		}
		int [][] intArr2 = new int[][]{
			{1, 2, 3, 4},
			{4, 5, 6}
		};
		int [][] intArr3 = {
			new int[]{1, 2, 3, 4},
			new int[]{4, 5, 6}
		};
		int [][] intArr4 = new int[][]{
			new int[]{1, 2, 3, 4},
			new int[]{4, 5, 6}
		};
	}
}
