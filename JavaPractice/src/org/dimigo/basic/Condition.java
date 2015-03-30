
package org.dimigo.basic;

public class Condition {

	public static void main (String[] args) {
		int distance = 10, car = 1, m1 = 850, m2 = 300, m3 = 600;
		int n = 0;
		System.out.println("<<고속도로 통행료 계산 >>");
		switch (car) {
		case 1:
			System.out.println("거리 : " + distance + "km");
			System.out.println("차량 : 고속버스");
			if (distance <= 10)
				System.out.println("통행료 : " + m1 + "원");
			else {
				n += (distance - 1) / 10;
				System.out.println("통행료 : " + (m1 + (300 * n)) + "원");
			}
			break;
		case 2:
			System.out.println("거리 : " + distance + "km");
			System.out.println("차량 : 경차");
			if (distance <= 10)
				System.out.println("통행료 : " + m2 + "원");
			else {
				n += (distance - 1) / 10;
				System.out.println("통행료 : " + (m2 + (300 * n)) + "원");
			}
			break;
		case 3:
			System.out.println("거리 : " + distance + "km");
			System.out.println("차량 : 그 외");
			if (distance <= 10)
				System.out.println("통행료 : " + m3 + "원");
			else {
				n += (distance - 1) / 10;
				System.out.println("통행료 : " + (m3 + (300 * n)) + "원");
			}
		}
	}
}
