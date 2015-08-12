package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_Person
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 19.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Person {

	private String name;
	private int age;
	
	private final String birthDt;
	private final String bloodType;
	private final String type = "mammals";
	
	public Person(String name, int age, String birthDt, String bloodtype) {
		this.name = name;
		this.age = age;
		this.birthDt = birthDt;
		this.bloodType = bloodtype;
	}

	@Override
	public String toString () {
		return "Person [name=" + name + ", age=" + age + ", birthDt=" + birthDt + ", bloodType=" + bloodType + ", type=" + type
			+ "]";
	}
	
	
}
