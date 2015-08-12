package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_Circle
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Circle extends Figure {

	private int radius;
	
	public Circle(int radius) {
		this(0, 0, radius);
	}
	/**
	 * @param centerX
	 * @param centerY
	 */
	public Circle (int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return radius * radius * Math.PI;
	}

}
