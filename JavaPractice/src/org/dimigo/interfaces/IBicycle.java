package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	|_IBicycle
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 2.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public interface IBicycle {
	
	// automatically public static final
	int MIN_GEAR = 1;
	int MIN_SPEED = 0;
	
	// automatically public abstract
	void changeGear(int gear);
	
	void speedUp(int speed);
	
	void speedDown(int speed);
}
