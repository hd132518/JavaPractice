package org.dimigo.basic;

public class Switch {

	public static void main(String [] args) {
		for(int i = 0; i < 10; i++) {
			double d = Math.random();
			int random = (int)(d * 6);
			System.out.println(random + 1);
		}
		
		int num = (int)(Math.random() * 6) + 1;
		switch(num % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("넌 누구냐!!");
		}
	}
}
