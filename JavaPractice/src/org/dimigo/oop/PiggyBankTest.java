package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_PiggyBankTest
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class PiggyBankTest {
	public static void main (String[] args) {
		FamilyMember appa = new FamilyMember("아빠");
		FamilyMember eomma = new FamilyMember("엄마");
		FamilyMember na = new FamilyMember("나");
		FamilyMember namdongsaeng = new FamilyMember("남동생");
		
		PiggyBank.putMoney(appa, 10000);
		PiggyBank.putMoney(eomma, 5000);
		PiggyBank.putMoney(na, 2000);
		PiggyBank.putMoney(namdongsaeng, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(na, 1000);
		
		PiggyBank.printBalance();
	}
}
