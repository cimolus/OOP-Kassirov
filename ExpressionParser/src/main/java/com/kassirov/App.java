package com.kassirov;


import java.util.Scanner;

import com.kassirov.calculators.ExpressionCalculator;
import com.kassirov.parsers.ExpressionParser;


public class App 
{
	
	
    public static void main( String[] args )
    {
    	
    	Scanner scanner = new Scanner(System.in);
    	ExpressionParser expressionParser = new ExpressionParser();
    	ExpressionCalculator expressionCalculator = new ExpressionCalculator();
    	
    	System.out.println("Введите выражение: ");
    	double result = expressionCalculator.calculate(expressionParser.parse(scanner.next()));
    	System.out.println("Результат: " + result);
    	
    }
}
