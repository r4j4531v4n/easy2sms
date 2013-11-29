package easy2sms;




public interface Callback<T> {

	void completed(HttpResponse<T> response);	
	
	void failed(UnirestException e);
	
	void cancelled();
}
