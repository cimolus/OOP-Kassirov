package com.kassirov.models;

import java.util.Random;

public class Request {
	private String requestType;
	private String requestContent;
	private int version = 1;
	private int subversion;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
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
	
	
}
