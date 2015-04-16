package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_Student
 * 
 * 개요 : 
 * 작성일 : 2015. 4. 17.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Student {
	int gisu;
	int grade;
	int ban;
	int number;
	String name;
	String address;
	String phone;

	public int getGisu () {
		return gisu;
	}

	public void setGisu (int gisu) {
		this.gisu = gisu;
	}

	public int getGrade () {
		return grade;
	}

	public void setGrade (int grade) {
		this.grade = grade;
	}

	public int getBan () {
		return ban;
	}

	public void setBan (int ban) {
		this.ban = ban;
	}

	public int getNumber () {
		return number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getAddress () {
		return address;
	}

	public void setAddress (String address) {
		this.address = address;
	}

	public String getPhone () {
		return phone;
	}

	public void setPhone (String phone) {
		this.phone = phone;
	}

	/**
	 * @param gisu
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 * @param address
	 * @param phone
	 */
	public Student (int gisu, int grade, int ban, int number, String name, String address, String phone) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/**
	 * @param gisu
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 * @param address
	 */
	public Student (int gisu, int grade, int ban, int number, String name, String address) {
		this(gisu, grade, ban, number, name, address, "휴대폰없음");
	}

	/**
	 * @param gisu
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 */
	public Student (int gisu, int grade, int ban, int number, String name) {
		this(gisu, grade, ban, number, name, "주소없음", "휴대폰없음");
	}
	
	/**
	 * @param gisu
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 */
	public Student (int gisu, int grade, int ban, int number) {
		this(gisu, grade, ban, number, "이름없음", "주소없음", "휴대폰없음");
	}

	public Student () {
		// TODO Auto-generated constructor stub
	}
	
	public void printStudent() {
		System.out.println("<< 학생 정보 출력 >>");
		System.out.printf("1. 학번 : %d\n", number);
		System.out.printf("2. 이름: %s\n", name);
		System.out.printf("3. 주소 : %s\n", address);
		System.out.printf("4. 휴대폰번호 : %s\n\n", phone);
	}
}
