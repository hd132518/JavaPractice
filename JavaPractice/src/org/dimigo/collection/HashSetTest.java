package org.dimigo.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_HashSetTest
 * 
 * 개요 : 
 * 작성일 : Oct 13, 2015
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class HashSetTest {
	public static void main (String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("짜장면");
		set.add("짬뽕");
		set.add("탕수육");
		set.add("짜장면");
		
		printSet(set);
		
		List<String>list = Arrays.asList("떡볶이", "순대", "튀김", "순대", "순대");
		Set<String> set2 = new HashSet<String>(list);
	}
	
	public static void printSet(Set<String> set){
		for(String value: set) {
			System.out.println(value);
		}
	}
}
