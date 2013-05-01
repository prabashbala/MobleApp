package uk.gov.bcc.mobile.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class MobileApiRequestService {

	public Map<String, String> getMobileApiResponse() {

		return null;
	}
	
	public static void main(String[] args) {
		MobileApiRequestService re= new MobileApiRequestService();
		re.getHttpConnection();
	}

	private void getHttpConnection() {
		URL url = null;
		
		String reqeust="<loginTokenMobileRequest><userTokenId></userTokenId><applicationTokenId>DC4F01193B4</applicationTokenId><userid>mobile.test2@mailinator.com</userid><password>password1</password></loginTokenMobileRequest>";

		HttpURLConnection urlConnection = null;
		try {
			url = new URL("http://10.65.17.187:8080/api/Customer/Login");
			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setDoOutput(true);
			urlConnection.setChunkedStreamingMode(0);
			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Type", "application/xml");
			OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
			out.write(reqeust.getBytes());

			InputStream in = new BufferedInputStream(urlConnection.getInputStream());
			System.out.println(in.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			urlConnection.disconnect();
		}
	}
}
