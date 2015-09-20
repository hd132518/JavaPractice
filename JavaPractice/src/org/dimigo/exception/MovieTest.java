
package org.dimigo.exception;

/** <pre>
 * org.dimigo.exception
 * 	|_MovieTest
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class MovieTest {
	private static void buyTicket (Movie movie, int age) throws AgeCheckException {
		if(movie.getLimitAge() > age) throw new AgeCheckException(movie);
		else System.out.println(movie.getTitle()+" 영화 즐감하세용~~");
	}

	public static void main (String[] args) {
		Movie[] movies = {new Movie("앤트맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)};
		int age = 13;
		for (Movie movie : movies) {
			try {
				buyTicket(movie, age);
			} catch (AgeCheckException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
