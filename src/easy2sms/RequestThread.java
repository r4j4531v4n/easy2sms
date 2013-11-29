package easy2sms;




public class RequestThread<T> extends Thread {

	private HttpRequest httpRequest;
	private Class<T> responseClass;
	private Callback<T> callback;
	
	public RequestThread(HttpRequest httpRequest, Class<T> responseClass, Callback<T> callback) {
		this.httpRequest = httpRequest;
		this.responseClass = responseClass;
		this.callback = callback;
	}
	
	@Override
	public void run() {
		HttpResponse<T> response;
		try {
			response = HttpClientHelper.request(httpRequest, responseClass);
			if (callback != null) {
				callback.completed(response);
			}
		} catch (UnirestException e) {
			callback.failed(e);
		}
	}
	
}
