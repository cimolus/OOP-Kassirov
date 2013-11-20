package com.kassirov.logparser.parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.kassirov.logparser.models.Node;
import com.kassirov.logparser.models.Record;

public class RecordParser {
	
	public Record parse(String logString) {
		
		List<Node> nodes = new ArrayList<Node>();
		String node = logString.split("--")[0];
		logString = logString.split("--")[1];
		nodes.add(new Node(node, "--"));
		nodes.add(new Node(parseBySeparator("[", "]", logString),"[]"));
		nodes.add(new Node(parseBySeparator("\"", "\"", logString),"\"\""));
		nodes.add(new Node(parseBySeparator("'", "'", logString),"''"));
		return new Record(nodes);
	}
	
	public String parseBySeparator(String separator1, String separator2, String str) {
		String regex = "\\" + separator1 + "(.*?)\\" + separator2;
		Pattern pat = Pattern.compile(regex); //\[(.*?)\]
		Matcher mat = pat.matcher(str);
		mat.find();
		String result = mat.group();
		return result.substring(1,result.length() - 1);
		
	}
}
