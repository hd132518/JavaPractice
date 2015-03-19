package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int won = 17000000;
		int emp = 3;
		int gae = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원\n", won);
		System.out.printf("점포 내 직원 수 : %d명\n", emp);
		System.out.printf("점포 수 : %,d개\n\n", gae);
		System.out.printf("연간 인건비 : %,d원", 12l * won * emp * gae);
	}
}
