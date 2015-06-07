package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_CommandLine
 * 
 * 개요 : 
 * 작성일 : 2015. 6. 1.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class CommandLine {

	public static void main (String[] args) {
		if(args.length != 2) {
			System.out.println("<Program Help>");
			System.out.println("java CommandLine arg1 arg2");
			System.exit(0);
		}
		System.out.println(Arrays.toString(args));
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + " + " + num2 + " + " + (num1 + num2));
	}
}
