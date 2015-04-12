package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_BookTest
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 10.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("자바를 잡아라", "김자바", 293);
		
		System.out.println(book);
		
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPage());
	}
}
