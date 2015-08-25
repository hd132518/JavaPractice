package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_SmartPhoneTest
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone s = new IPhone("IPhone 6", "애플", 700000);
		System.out.println(s.toString());
		s.turnOn();
		s.pay();
		s.useSpecialFunction(s);
		s.turnOff();
		System.out.println();
		
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction(s);
		g.turnOff();
		
	}
}
