package com.kassirov.logparser.parsers;

import com.kassirov.models.Request;
import com.kassirov.models.RequestHttpMethod;
import com.kassirov.models.RequestUrl;
import com.kassirov.models.RequestVersion;

public class RequestParser {
	
	public Request parse(String node) {
		String[] parseNode = node.split(" ");
		RequestHttpMethod requestHttpMethod = new RequestHttpMethod(parseNode[0]);
		RequestUrl requestUrl = new RequestUrl(parseNode[1]);
		String[] parseNode2 = parseNode[2].split("/");
		String[] parseVersion = parseNode2[1].split("\\.");
		RequestVersion requestVersion = new RequestVersion(Integer.parseInt(parseVersion[0]), Integer.parseInt(parseVersion[1]), parseNode2[0]);
		return new Request(requestHttpMethod, requestUrl, requestVersion);
	}
	
}
