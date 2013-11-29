package easy2sms;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.nio.client.HttpAsyncClient;



public class Unirest {
	
	/**
	 * Set the HttpClient implementation to use for every synchronous request
	 */
	public static void setHttpClient(HttpClient httpClient) {
		Options.setOption(Option.HTTPCLIENT, httpClient);
	}
	
	/**
	 * Set the connection timeout and socket timeout
	 */
	public static void setTimeouts(long connectionTimeout, long socketTimeout) {
		Options.setOption(Option.CONNECTION_TIMEOUT, connectionTimeout);
		Options.setOption(Option.SOCKET_TIMEOUT, socketTimeout);
		
		// Reload the client implementations
		Options.refresh();
	}
	
	/**
	 * Clear default headers
	 */
	public static void clearDefaultHeaders() {
		Options.setOption(Option.DEFAULT_HEADERS, null);
	}
	
	/**
	 * Set default header
	 */
	@SuppressWarnings("unchecked")
	public static void setDefaultHeader(String name, String value) {
		Object headers = Options.getOption(Option.DEFAULT_HEADERS);
		if (headers == null) {
			headers = new HashMap<String, String>();
		}
		((Map<String, String>) headers).put(name, value);
		Options.setOption(Option.DEFAULT_HEADERS, headers);
	}
	
	/**
	 * Set the asynchronous AbstractHttpAsyncClient implementation to use for every asynchronous request
	 */
	public static void setAsyncHttpClient(HttpAsyncClient asyncHttpClient) {
		Options.setOption(Option.ASYNCHTTPCLIENT, asyncHttpClient);
	}
	
	public static GetRequest get(String url) {
		return new GetRequest(HttpMethod.GET, url);
	}
	
	public static HttpRequestWithBody post(String url) {
		return new HttpRequestWithBody(HttpMethod.POST, url);
	}
	
	public static HttpRequestWithBody delete(String url) {
		return new HttpRequestWithBody(HttpMethod.DELETE, url);
	}
	
	public static HttpRequestWithBody patch(String url) {
		return new HttpRequestWithBody(HttpMethod.PATCH, url);
	}
	
	public static HttpRequestWithBody put(String url) {
		return new HttpRequestWithBody(HttpMethod.PUT, url);
	}
	
}
