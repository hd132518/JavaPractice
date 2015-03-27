package org.dimigo.basic;


public class For {

	public static void main(String[] args) {
		//for
		System.out.println("<< 번호 출력하기 >>");
		for(int i = 1; i <= 37; i++) {
			System.out.print(i+"번 ");
			if(i%10==0) System.out.println();
		}
		System.out.println();
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++)
				System.out.printf("%d * %d = %2d, ", i, j, i * j);
			System.out.println();
		}
		
		int[] intArr = {1, 2, 3, 4, 5};
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("<< 무한도전 멤버 >>");
		String[] member = {"유재석", "정준하", "박명수", "하하", "정형돈"};
		
		for(String s : member) System.out.println(s);
	}
}
