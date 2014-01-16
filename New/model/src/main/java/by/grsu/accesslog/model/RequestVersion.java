package by.grsu.accesslog.model;

public class RequestVersion {
	
	private String requestProtocol;
	
	private int version = 1;
	
	private int subversion;
	
	public RequestVersion(int version, int subversion, String requestProtocol) {
		this.version = version;
		this.subversion = subversion;
		this.requestProtocol = requestProtocol;
	}
	
	public RequestVersion(int subversion, String requestProtocol) {
		this.subversion = subversion;
		this.requestProtocol = requestProtocol;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	
	public int getSubversion() {
		return subversion;
	}
	
	public void setSubversion(int subversion) {
		this.subversion = subversion;
	}

	public String getRequestProtocol() {
		return requestProtocol;
	}

	public void setRequestProtocol(String requestProtocol) {
		this.requestProtocol = requestProtocol;
	}
}
