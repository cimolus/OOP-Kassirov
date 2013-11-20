package com.kassirov.logparser.parsers;

import com.kassirov.logparser.models.Node;
import com.kassirov.logparser.models.Record;
import com.kassirov.models.Date;
import com.kassirov.models.IP;
import com.kassirov.models.Log;
import com.kassirov.models.Request;
import com.kassirov.models.Response;

public class LogParser {
	
	private RecordParser recordParser = new RecordParser();
	
	private IpParser ipParser = new IpParser();
	
	private DateParser dateParser = new DateParser();
	
	private RequestParser requestParser = new RequestParser();
	
	private ResponseParser responseParser = new ResponseParser();
	
	public Log parse(String logString) {
		Record record = recordParser.parse(logString);
		IP ip = null;
		Date date = null;
		Request request = null;
		Response response = null;
		for( Node node:record.getNodes()) {
			switch (node.getSeparator()) {
				case "--":
					ip = ipParser.parse(node.getNode());
					break;
				case "[]":
					date = dateParser.parse(node.getNode());
					break;
				case "\"\"":
					request = requestParser.parse(node.getNode());
					break;
				case "''":
					response = responseParser.parse(node.getNode());
					break;
			default:
				break;
			}
		}
		return new Log(ip, date, request, response);
	}
	
}
