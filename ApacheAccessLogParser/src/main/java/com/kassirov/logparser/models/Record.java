package com.kassirov.logparser.models;

import java.util.ArrayList;
import java.util.List;

public class Record {
	
	private List<Node> nodes;
	
	public Record( List<Node> nodes ) {
		this.setNodes(nodes);
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	
	
	
}
