
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/** <pre>
 * org.dimigo.io
 * 	|_SaveImageFromUrl
 * 
 * 개요 : 
 * 작성일 : Oct 26, 2015
 * </pre>
 *
 * @author 박건
 * @version 1.0 */
public class SaveImageFromUrl {

	public static void main (String[] args) {
		String imageUrlString = "https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
		try {
			URL url = new URL(imageUrlString);
			try (InputStream is = url.openStream()) {
				OutputStream os = new FileOutputStream("files/logo.png");
				byte[] bytes = new byte[100];
				while(is.read(bytes) != -1) {
					os.write(bytes);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
