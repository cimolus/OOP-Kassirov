package com.kassirov.logparser;


import java.util.List;

import com.kassirov.converters.LogConverter;
import com.kassirov.logparser.models.Node;
import com.kassirov.logparser.models.Record;
import com.kassirov.logparser.parsers.LogParser;
import com.kassirov.logparser.readers.IReader;
import com.kassirov.logparser.readers.TxtFileReader;
import com.kassirov.models.Log;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IReader reader = new TxtFileReader();
        LogConverter logConverter = new LogConverter();
        LogParser logParser = new LogParser();
        for(String str: reader.readAllStrings() ) {
        	Log log = logParser.parse(str);
        	System.out.println(logConverter.convertToString(log));
        }
        
        
        
    }
}
