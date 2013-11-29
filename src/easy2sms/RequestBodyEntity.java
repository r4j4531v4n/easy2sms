package easy2sms;

import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;



public class RequestBodyEntity extends BaseRequest implements Body {

	private Object body;
	
	public RequestBodyEntity(HttpRequest httpRequest) {
		super(httpRequest);
	}
	
	public RequestBodyEntity body(String body) {
		this.body = body;
		return this;
	}
	
	public RequestBodyEntity body(JsonNode body) {
		this.body = body.toString();
		return this;
	}
	
	public Object getBody() {
		return body;
	}

	public HttpEntity getEntity() {
		try {
			return new StringEntity(body.toString(), UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
}
