package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_IdolGroup
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class IdolGroup {

	public static void main (String[] args) {
		String[] idolGroup = {"Monstercat", "Hyperbrain", "Spinnin' Records"};
		String[][] members = {
			{"Au5", "Braken", "Haywyre", "Laszlo", "Pegboard Nerds"},
			{"PenguinMike", "ZeroTech"},
			{"Afrojack", "Ummet Ozcan", "Marin Garrix", "KSHMR"}
		};
		for(int i = 0; i < idolGroup.length; i++) {
			System.out.println(idolGroup[i]);
			for(String member : members[i]) {
				System.out.println("\t"+member);
			}
		}
	}
}
