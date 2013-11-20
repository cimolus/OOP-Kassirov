package com.kassirov.calculators;

import java.util.List;

public class PowerCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.pow(params.get(0), params.get(1));
	}
	
}
