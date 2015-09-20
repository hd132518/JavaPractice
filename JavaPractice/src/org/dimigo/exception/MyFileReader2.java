package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <pre>
 * org.dimigo.exception
 * 	|_MyFileReader2
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 16.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class MyFileReader2 {

	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Programming\\주공1.csv"))) {
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("error while opening file");
		}
	}
}
