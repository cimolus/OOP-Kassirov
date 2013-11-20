package com.kassirov.calculators;

import java.util.List;

public class DivisionCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return params.get(0) / params.get(1);
	}
	
}
