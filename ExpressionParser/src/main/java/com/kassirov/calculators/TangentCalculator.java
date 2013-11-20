package com.kassirov.calculators;

import java.util.List;

public class TangentCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.tan(params.get(0));
	}
	
}
