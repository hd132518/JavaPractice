package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_ArrayListTest2
 * 
 * 개요 : 
 * 작성일 : Oct 13, 2015
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		// Make an ArrayList and add Superman, Batman, and Spiderman to it
		List<String>list = new ArrayList<String>();
		list.add("슈퍼맨");
		list.add("배트맨");
		list.add("스파이더맨");
		System.out.println(list);
		
		List<String> list2 = Arrays.asList("슈퍼맨", "배트맨", "스파이더맨");
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		String[] arr = new String[list.size()]; 
	}
}
