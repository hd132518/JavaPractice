package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double s_a = 9;
		double s_b = 10;
		double s_height = 5.8;
		double p_a = 9;
		double p_height = 5.4;
		double s_area = (s_a + s_b) * s_height / 2;
		double p_area = p_a * p_height;
		System.out.printf("사다리꼴 넓이 : %f\n", s_area);
		System.out.printf("평행사변형 넓이 : %f\n", p_area);
		
		System.out.println(s_area < p_area? "평행사변형이 사다리꼴보다 "+(p_area - s_area)+" 더 큽니다": s_area == p_area? "두 개 도형의 넓이가 같습니다": "사다리꼴이 평행사변형보다 "+(s_area - p_area)+" 더 큽니다");
		
	}
}
