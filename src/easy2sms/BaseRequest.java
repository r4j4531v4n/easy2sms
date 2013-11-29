package easy2sms;


import java.io.InputStream;
import java.util.concurrent.Future;

public abstract class BaseRequest {

	protected static final String UTF_8 = "UTF-8";
	
	protected HttpRequest httpRequest;
	
	protected BaseRequest(HttpRequest httpRequest) {
		this.httpRequest = httpRequest;
	}
	
	protected BaseRequest() {
		super();
	}
	
	public HttpResponse<String> asString() throws UnirestException {
		return HttpClientHelper.request(httpRequest, String.class);
	}

	public Future<HttpResponse<String>> asStringAsync() {
		return HttpClientHelper.requestAsync(httpRequest, String.class, null);
	}
	
	public Future<HttpResponse<String>> asStringAsync(Callback<String> callback) {
		return HttpClientHelper.requestAsync(httpRequest, String.class, callback);
	}

	public HttpResponse<JsonNode> asJson() throws UnirestException {
		return HttpClientHelper.request(httpRequest, JsonNode.class);
	}

	public Future<HttpResponse<JsonNode>> asJsonAsync() {
		return HttpClientHelper.requestAsync(httpRequest, JsonNode.class, null);
	}
	
	public Future<HttpResponse<JsonNode>> asJsonAsync(Callback<JsonNode> callback) {
		return HttpClientHelper.requestAsync(httpRequest, JsonNode.class, callback);
	}

	public HttpResponse<InputStream> asBinary() throws UnirestException {
		return HttpClientHelper.request(httpRequest, InputStream.class);
	}

	public Future<HttpResponse<InputStream>> asBinaryAsync() {
		return HttpClientHelper.requestAsync(httpRequest, InputStream.class, null);
	}
	
	public Future<HttpResponse<InputStream>> asBinaryAsync(Callback<InputStream> callback) {
		return HttpClientHelper.requestAsync(httpRequest, InputStream.class, callback);
	}

}
