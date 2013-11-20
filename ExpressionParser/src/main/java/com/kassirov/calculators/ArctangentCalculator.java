package com.kassirov.calculators;

import java.util.List;

public class ArctangentCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.atan(params.get(0));
	}
	
}
