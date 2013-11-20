package com.kassirov.logparser.models;

public class Node {
	
	private String separator;
	
	private String node;
	
	public Node(String node, String separator) {
		this.node = node;
		this.setSeparator(separator);
	}
	
	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}
}
