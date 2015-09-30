package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_HashMapTest
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class HashMapTest {
	
	public static void main (String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("kor", 100);
		map.put("mat", 92);
		map.put("eng", 95);
		
		printMap(map);
		
		map.put("eng", 97);
		
		printMap(map);
		
		System.out.println(map.get("kor"));
		System.out.println(map.get("sci"));
		
		
		map.replace("kor", 90);
		map.replace("java", 100);
		
		printMap(map);
		
		map.remove("map");
	}
	
	public static void printMap(Map<String, Integer> map) {
		for(String key : map.keySet()) {
			System.out.println(key + " => " + map.get(key));
		}
		System.out.println("--------------------------");
	}
	
}
