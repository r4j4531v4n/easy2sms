package easy2sms;

import org.apache.http.client.HttpClient;
import org.apache.http.nio.client.HttpAsyncClient;


public class ClientFactory {

	public static HttpClient getHttpClient() {
		return (HttpClient) Options.getOption(Option.HTTPCLIENT);
	}
	
	public static HttpAsyncClient getAsyncHttpClient() {
		return (HttpAsyncClient) Options.getOption(Option.ASYNCHTTPCLIENT);
	}
	
}
