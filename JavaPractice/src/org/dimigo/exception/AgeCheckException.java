package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|_AgeCheckException
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle()+"은/는 "+movie.getLimitAge()+"세 이상 관람가입니다.");
	}
}
