package easy2sms;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;



public class MultipartBody extends BaseRequest implements Body {

	private Map<String, Object> parameters = new HashMap<String, Object>();

	private boolean hasFile;
	private HttpRequest httpRequestObj;
	
	public MultipartBody(HttpRequest httpRequest) {
		super(httpRequest);
		this.httpRequestObj = httpRequest;
	}
	
	public MultipartBody field(String name, String value) {
		parameters.put(name, value);
		return this;
	}
	
	public MultipartBody field(String name, File file) {
		this.parameters.put(name, file);
		hasFile = true;
		return this;
	}
	
	public MultipartBody basicAuth(String username, String password) {
		httpRequestObj.basicAuth(username, password);
		return this;
	}
	
	public HttpEntity getEntity() {
		if (hasFile) {
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			for(Entry<String, Object> part : parameters.entrySet()) {
				if (part.getValue() instanceof File) {
					hasFile = true;
					builder.addPart(part.getKey(), new FileBody((File) part.getValue()));
				} else {
					builder.addPart(part.getKey(), new StringBody(part.getValue().toString(), ContentType.APPLICATION_FORM_URLENCODED));
				}
			}
			return builder.build();
		} else {
			try {
				return new UrlEncodedFormEntity(MapUtil.getList(parameters), UTF_8);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
