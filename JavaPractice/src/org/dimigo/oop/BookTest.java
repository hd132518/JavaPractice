package org.dimigo.oop;

import org.dimigo.basic.Book;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_BookTest
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 23.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class BookTest {
	
	private void methodA (Book book) {
		book.setTitle("자바를 잡아라!");
		System.out.println(book.getTitle());
	}
	public static void main (String[] args) {
		Book book = new Book("미생", "유태호", 200);
		
		BookTest test = new BookTest();
		test.methodA(book);
		
		new BookTest().methodA(book);
		System.out.println(book.getTitle());
		
		((Book)null).getAuthor();
	}
}
