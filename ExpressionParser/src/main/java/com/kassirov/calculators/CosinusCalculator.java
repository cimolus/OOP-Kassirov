package com.kassirov.calculators;

import java.util.List;

public class CosinusCalculator implements ICalculator {

	public double calculate(List<Double> params) {
		return Math.cos(params.get(0));
	}

}
