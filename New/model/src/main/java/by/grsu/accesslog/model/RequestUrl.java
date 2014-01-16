package by.grsu.accesslog.model;

public class RequestUrl {
	private String url;
	private String extension;
	
	public RequestUrl( String url, String extension ) {
		this.url = url;
		this.extension = extension;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
}
