package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_SnackTest
 * 
 * 개요 : 
 * 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		Snack snack[] = {
			new Snack("새우깡", "농심", 1100, 2),
			new Snack("콘칲", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4),
		};
		
		int sum = 0;
		for(Snack s : snack) {
			s.printSnack();
			sum += s.calcPrice();
			System.out.println();
		}
		System.out.println(String.format("총 구매 금액 : %,d원", sum));
	}

}
