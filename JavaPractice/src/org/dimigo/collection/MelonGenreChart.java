package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_MelonGenreChart
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class MelonGenreChart {

	public static void main (String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> ballad = new ArrayList<>();
		map.put("발라드", ballad);
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		List<Music> dance = new ArrayList<>();
		map.put("댄스", dance);
		dance.add(new Music("커피", "유재환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		System.out.println("------<< 멜론 장르별 차트 >>------");
		printMap(map);
	}

	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println('['+key+']');
			for(int i = 0; i < map.get(key).size(); i++) {
				System.out.println(i + 1 + ". " + map.get(key).get(i).toString());
			}
		}
	}

}
