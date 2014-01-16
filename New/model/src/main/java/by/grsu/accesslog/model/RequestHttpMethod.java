package by.grsu.accesslog.model;

public class RequestHttpMethod {
	private String requestMethod;
	
	public RequestHttpMethod(String requestMethod) {
		this.setRequestMethod(requestMethod);
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	
	
}
