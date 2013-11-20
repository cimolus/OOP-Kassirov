package com.kassirov.calculators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ExpressionCalculator {
	
	private Map<String,ICalculator> calculators = new HashMap<String, ICalculator>();
	
	public ExpressionCalculator() {
		initCalculators();
	}
	
	private void initCalculators() {
		calculators.put("+", new AdditionCalculator());
		calculators.put("-", new SubstractionCalculator());
		calculators.put("*", new MultiplicationCalculator());
		calculators.put("/", new DivisionCalculator());
		calculators.put("^", new PowerCalculator());
		calculators.put("sqrt", new SquareCalculator());
		calculators.put("sin", new SinusCalculator());
		calculators.put("cos", new CosinusCalculator());
		calculators.put("tan", new TangentCalculator());
		calculators.put("atan", new ArctangentCalculator());
	}
	
	
	private Stack<String> reverseStack(Stack<String> stack ) {
		Stack<String> reverseStack = new Stack<String>();
		
		while( !stack.isEmpty() ) {
			reverseStack.push(stack.pop());
		}
		return reverseStack;
	}
	
	public double calculate(Stack<String> stack) {
		double result = 0;
		Stack<String> rnp = reverseStack(stack);
		ICalculator calculator;
		List<Double> params = new ArrayList<Double>();
		while( !rnp.empty() ) {
			String temp = stack.pop();
			if ( !calculators.containsKey(temp) )
				params.add(Double.parseDouble(temp));
			else {
				calculator = calculators.get(temp);
				rnp.push(calculator.calculate(params));
			}
		}
		return result;
	}
	
}
