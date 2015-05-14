
package org.dimigo.oop;

import org.dimigo.basic.Book;
import org.dimigo.basic.For;

/** <pre>
 * org.dimigo.oop
 * 	|_ArrayBasic
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class ArrayBasic {

	public static void main (String[] args) {
		int[] intArr = null;
		intArr = new int[5];
		for (int i : intArr) {
			System.out.println(i);
		}

		String[] strArr = new String[3];
		for (String value : strArr) {
			System.out.println(value + " | ");
		}
		System.out.println();

		Book[] bookArr = new Book[3];

		bookArr[0] = new Book("박건의 일생");
		bookArr[1] = new Book("김정현은 왜 망했는가");
		bookArr[2] = new Book("김정현처럼 망하지 않으려면 어떨게 해야 하는가");
		for (Book value : bookArr) {
			System.out.println(value.getTitle() + " / ");
		}
	}
}
