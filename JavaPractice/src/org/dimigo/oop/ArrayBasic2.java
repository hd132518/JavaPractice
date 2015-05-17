package org.dimigo.oop;

import org.dimigo.basic.Book;

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
		
		String[] strArr = {"faker", "rapid star", "mad life"};
		String[] strArr1 = {"faker", "rapid star", "mad life"};
		for(String value : strArr) {
			System.out.println(value + " | ");
		}
		System.out.println();
		
		// Let's make and initialize a Book type array at the same time!
		Book[] books = {
			new Book("미생", "윤태호", 30000), 
			new Book("김정현은 왜 망했는가", "sksksk", 200000), 
			new Book("김정현이 죽은 이유", "박건", 342234324),
			new Book("대학물리학[1]", "고로고로0", 8000)
		};
		for(Book book : books) {
			System.out.println(book.getTitle() + "|");
		}
	}
}
