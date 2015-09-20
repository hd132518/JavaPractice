package org.dimigo.basic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;

import com.sun.net.ssl.internal.www.protocol.https.HttpsURLConnectionOldImpl;


/**
 * <pre>
 * org.dimigo.basic
 * 	|_Test
 * 
 * 개요 : 
 * 작성일 : 2015. 8. 29.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Test {
	public static void main (String[] args) {
		try {
			/*boolean all = false;
			for(char i = 'X'; i <= 'Z'; i++){
				for(char j = 'A'; j <= 'Z'; j++){
					for(char k = 'A'; k <= 'Z'; k++) {
						for(char l = 'A'; l <= 'Z'; l++) {
							if(!sendPost(""+i+j+k+l)) {
								all = true;
								break;
							}
							System.out.println(""+i+j+k+l);
						}
						if(all) break;
					}if(all) break;
		}if(all) break;
	}*/
			sendPost("YAHH");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// HTTP POST request
	private static boolean  sendPost(String a) throws Exception {

		String url = "http://prob.layer7.kr/pusheen/check.php";
		URL obj = new URL(url);
		sun.net.www.protocol.http.HttpURLConnection con = (sun.net.www.protocol.http.HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "collect="+a+"&add=http%3A%2F%2Fprob.layer7.kr%2Fpusheen%2Fcheck.php";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		System.out.println(response.toString());
		return response.toString().contains("NO");

	}

}
