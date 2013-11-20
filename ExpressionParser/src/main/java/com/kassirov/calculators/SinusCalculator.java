package com.kassirov.calculators;

import java.util.List;

public class SinusCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.sin(params.get(0));
	}
	
}
