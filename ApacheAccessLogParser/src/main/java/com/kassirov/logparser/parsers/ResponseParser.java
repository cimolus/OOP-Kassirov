package com.kassirov.logparser.parsers;

import com.kassirov.models.Response;
import com.kassirov.models.ResponseHttpStatus;
import com.kassirov.models.ResponseSize;

public class ResponseParser {

	public Response parse(String node) {
		String[] parseNode = node.split(" ");
		ResponseHttpStatus responseHttpStatus = new ResponseHttpStatus(Integer.parseInt(parseNode[0]));
		ResponseSize responseSize = new ResponseSize(Integer.parseInt(parseNode[1]));
		return new Response(responseHttpStatus, responseSize);
	}
	
}
