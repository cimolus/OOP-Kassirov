package com.kassirov.parsers;

import java.util.Stack;

public class ExpressionParser {
	
	public Stack<String> parse( String input ) {
		String number = "";
		String operator = "";
		Stack<String> rnp = new Stack<String>();
		for ( int i = 0; i < input.length(); i++ ) {
			Character character = input.charAt(i);
			if ( Character.isWhitespace(character) )
				continue;
			if ( isDigit(character) ) {
				number += character;
				continue;
			} else if ( Character.isLetter(character) )  {
				operator += character; 
			} else {
				rnp.push(operator);
				operator = character.toString();
			}
			
			if ( ! number.isEmpty() ) {
				rnp.push(number);
				number = "";
			}
			
		}
		
		return rnp;
	}
	
	private boolean isDigit(Character character) {
		if ( Character.isDigit(character) || character.equals('.') )
			return true;
		return false;
	}
	
}
