package by.grsu.accesslog.model;

public class Request {
	
	private RequestHttpMethod requestHttpMethod;
	
	private RequestUrl requestUrl;
	
	private RequestVersion requestVersion;
	
	public Request(RequestHttpMethod requestHttpMethod, RequestUrl requestUrl, RequestVersion requestVersion) {
		this.requestHttpMethod = requestHttpMethod;
		this.requestUrl = requestUrl;
		this.requestVersion = requestVersion;
	}
	
	public RequestHttpMethod getRequestHttpMethod() {
		return requestHttpMethod;
	}

	public void setRequestHttpMethod(RequestHttpMethod requestHttpMethod) {
		this.requestHttpMethod = requestHttpMethod;
	}

	public RequestUrl getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(RequestUrl requestUrl) {
		this.requestUrl = requestUrl;
	}

	public RequestVersion getRequestVersion() {
		return requestVersion;
	}

	public void setRequestVersion(RequestVersion requestVersion) {
		this.requestVersion = requestVersion;
	}
}
