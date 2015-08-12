package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_FigureTest
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		System.out.println(String.format("원의 넓이 : %.1f", c.calcArea()));
		System.out.println(String.format("삼각형 넓이 : %.1f", t.calcArea()));
		System.out.println(String.format("사각형 넓이 : %.1f", r.calcArea()));
	}

}
