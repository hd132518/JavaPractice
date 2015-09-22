package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_ArrayListTest
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class ArrayListTest {

	public static void main (String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		
		for(String str: list) {
			System.out.println(str);
		}
	}
}
