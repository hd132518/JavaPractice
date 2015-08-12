package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Calculator2
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 11.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Calculator2 {

	/** 인스턴스 필드  **/
	private boolean powerFlag = false;
	
	/** 인스턴스 메소드 **/
	public void powerOn() {
		if(!this.powerFlag) {
			this.powerFlag = true;
			System.out.println("전원을 켭니다.");
		}
	}
	
	public void powerOff() {
		this.powerFlag = false;
		System.out.println("전원을 끕니다.");
	}
	
	/** 정적 필드 **/
	public static double PI = 3.14159265358979323846264338;
	
	/** 정적 메소드 **/
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div(int num1, int num2) {
		return ((double) num1) / num2;
	}
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double mul(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		return ((double) num1) / num2;
	}
}
