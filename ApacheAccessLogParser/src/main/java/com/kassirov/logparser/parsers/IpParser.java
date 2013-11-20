package com.kassirov.logparser.parsers;

import com.kassirov.models.IP;

public class IpParser {
	
	public IP parse(String node) {
		String[] parseNode = node.split("\\.");
		
		return new IP(Integer.parseInt(parseNode[0]), 
				Integer.parseInt(parseNode[1]),
				Integer.parseInt(parseNode[2]),
				Integer.parseInt(parseNode[3]));
	}
}
