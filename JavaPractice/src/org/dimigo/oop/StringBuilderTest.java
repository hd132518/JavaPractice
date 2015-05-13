package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_StringBuilderTest
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class StringBuilderTest {

	public static void main (String[] args) {
		{
			long start = System.currentTimeMillis();
			String test = "abc";
			
			for(int i = 0; i < 100000; i++) {
				test += "def";
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println(end - start);
		}
		{
			long start = System.currentTimeMillis();
			StringBuilder test = new StringBuilder("abc");
			
			for(int i = 0; i < 100000; i++) {
				test.append("def");
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println(end - start);
		}
	}
}
