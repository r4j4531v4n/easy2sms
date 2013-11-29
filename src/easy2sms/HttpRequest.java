package easy2sms;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class HttpRequest extends BaseRequest {

	private HttpMethod httpMethod;
	protected String url;
	private Map<String, String> headers = new HashMap<String, String>();
	protected Body body;
	
	private URL parseUrl(String s) throws Exception {
		return new URI(s.replaceAll("\\s+", "%20")).toURL();
	}
	
	public HttpRequest(HttpMethod method, String url) {
		this.httpMethod = method;
		try {
			this.url = parseUrl(url).toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		super.httpRequest = this;
	}
	
	public HttpRequest basicAuth(String username, String password) {
		header("Authorization", "Basic " + Base64Coder.encodeString(username+ ":" + password));
		return this;
	}
	
	public HttpRequest header(String name, String value) {
		this.headers.put(name.toLowerCase(), value);
		return this;
	}
	
	public HttpRequest headers(Map<String, String> headers) {
		if (headers != null) {
			for(Map.Entry<String, String> entry : headers.entrySet()) {
				header(entry.getKey(), entry.getValue());
			}
		}
		return this;
	}
	
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public String getUrl() {
		return url;
	}

	public Map<String, String> getHeaders() {
		if (headers == null) return new HashMap<String, String>();
		return headers;
	}

	public Body getBody() {
		return body;
	}
	
}
