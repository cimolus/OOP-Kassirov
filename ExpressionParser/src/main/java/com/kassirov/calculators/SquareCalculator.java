package com.kassirov.calculators;

import java.util.List;

public class SquareCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.sqrt(params.get(0));
	}
	
}
