package com.stt.euopauto;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HttpUtil {
	public static Logger log = LogManager.getLogger("mylog");
	public static String getJsonRes(String url, String load) {
		String USER_AGENT = "Mozilla/5.0";
		String CONTENT_TYPE = "applicatoin/json";
		String POST_URL = url;
		String POST_PARAMS = load;
		HttpURLConnection connection = null;
		HttpsURLConnection httpsConnection = null;
		if(url.equals(null)) {
			return null;
		}else if(url.indexOf("http") < 0) {
			log.info("invalid url : " + url);
			return null;
		}
		try {
			URL post_url = new URL(POST_URL);
			trustAllHosts();
			connection = (HttpURLConnection) post_url.openConnection();
			
			//if this is a https
			if(post_url.getProtocol().toLowerCase().equals("https")) {
				httpsConnection = (HttpsURLConnection)post_url.openConnection();
				HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				};
				httpsConnection.setHostnameVerifier(DO_NOT_VERIFY);
				connection  = httpsConnection;
			}else {
				// stay with http
			}
			
			
			connection.setRequestProperty("Accect-Charset","UTF-8");
			connection.setRequestMethod("POST");
			connection.setConnectTimeout(15000);
			connection.setRequestProperty("User-Agent",USER_AGENT);
			connection.setRequestProperty("Content-type", CONTENT_TYPE);
			
			connection.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(POST_PARAMS);
			wr.flush();
			wr.close();
			int responseCode = connection.getResponseCode();
			String responseMessage = connection.getResponseMessage();
			
			//if 200
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				return response.toString();
			}else {
				return "no proper response from server";
			}
			
		}catch(Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
			return null;
		}
		
	}

	private static void trustAllHosts() {
		// TODO Auto-generated method stub
		String TAG = "trustAllHosts";
		X509TrustManager[] trustAllCerts = new X509TrustManager[] {new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers(){
				return new java.security.cert.X509Certificate[] {};
			}
			
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException{
				
			}
			
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				
			}
		}};
	}
}
