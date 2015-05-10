package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_StringTest
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 8.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// 1. 문자열 리터럴 방식 (Literal Pool에 생성)
		String dog1 = "멍멍이";
		String dog2 = "멍멍이";
		
		// 2. new 객체 생성 방식
		String cat1 = new String("야옹이");
		String cat2 = new String("야옹이");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		System.out.println(dog1 == "멍멍이");
		
		System.out.println(cat1.equals(cat2));
		
		String id = "admin";
		
		if(id != null && id.equals("admin")) {
			System.out.println("관리장입.");
		} else {
			System.out.println("관리자아님");
		}
		
		if("admin".equals(id)) {
			System.out.println("관리장입.");
		} else {
			System.out.println("관리자아님");
		}
	}

}
