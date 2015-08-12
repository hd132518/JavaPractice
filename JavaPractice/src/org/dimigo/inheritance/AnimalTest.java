package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_AnimalTest
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class AnimalTest {

	public static void main (String[] args) {
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.bark();
		
		Tiger tiger = new Tiger();
		tiger.bark();
	}

}
