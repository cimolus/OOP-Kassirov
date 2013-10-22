package com.kassirov.generators;

import java.util.Random;

public class ByteGenerator {
	
	private Random random = new Random();
	
	public int generate() {
		return random.nextInt(3000);
	}
}
