package org.dimigo.oop;

import java.util.Scanner;


/**
 * <pre>
 * org.dimigo.oop
 * 	|_Question
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Question {
	
	public static void main (String[] args) {

		int wrongcount = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("김정현의 나이를 구하여라.");
		int age = scanner.nextInt();
		if(age == 18) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다. 정답은 18입니다.");
			wrongcount++;
		}
		System.out.println();
		scanner.nextLine();
		
		System.out.println("자바에서 문자열을 다루기 위한 클래스를 구하여라.");
		String string = scanner.nextLine();
		if("String".equals(string)) {
			System.out.println("정답입니다.");
		} else if(wrongcount == 0) {
			System.out.println("틀렸습니다. 정답은 String입니다.");
			wrongcount++;
		} else {
			System.out.println("또 틀렸습니다. 아는게 뭡니까.");
			wrongcount++;
		}
		System.out.println();
		
		System.out.println("대한민국의 정식 국호를 구하여라.");
		String name = scanner.nextLine();
		if("대한민국".equals(name)) {
			System.out.println("정답입니다. 당신은 애국자입니다.");
		} else if(wrongcount == 2) {
			System.out.println("틀렸습니다. 당신은 아는 게 없는 매국노입니다.");
		} else {
			System.out.println("틀렸습니다. 당신은 매국노입니다.");
		}
		System.out.println();
		
		scanner.close();
 	}
	
}
