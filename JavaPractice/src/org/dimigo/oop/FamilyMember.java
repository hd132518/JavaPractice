package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_FamilyMember
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class FamilyMember {

	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : "+memberCnt+"명");
	}
}
