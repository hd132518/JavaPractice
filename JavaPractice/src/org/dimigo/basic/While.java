package org.dimigo.basic;

import java.util.Scanner;


public class While {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		switch(menu) {
		case 1:
			System.out.println("일본을 공격하라");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		}
		scanner.close();
	}

}
