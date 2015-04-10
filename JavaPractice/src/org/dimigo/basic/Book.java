package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_Book
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 10.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Book {

	private String title;
	private String author;
	private int page;
	
	public static void main(String[] args){
		Book book = new Book();
		Book book2 = new Book();
		
		System.out.println(book);
		System.out.println(book2);
	}
	
	public String getTitle () {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
}
