package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Score
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Score {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		double a = scanner.nextDouble();
		System.out.println("수학 점수 입력 => ");
		double b = scanner.nextDouble();
		System.out.println("영어 점수 입력 => ");
		double c = scanner.nextDouble();
		
		System.out.println(
			new StringBuilder("\n<< 점수 출력 >>\n")
			.append("국어 점수 : ")
			.append(a)
			.append("점\n")
			.append("수학 점수 : ")
			.append(b)
			.append("점\n")
			.append("영어 점수 : ")
			.append(c)
			.append("점\n")
			.append("총점 : ")
			.append(a + b + c)
			.append("점\n")
			.append("평균 : ")
			.append(String.format("%.1f", (a + b + c) /3))
			.append("점\n")
		);
	}
}
