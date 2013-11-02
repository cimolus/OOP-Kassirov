package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.Size;

public class SizeGenerator {
	
	private Random random = new Random();
	
	public Size generate() {
		return new Size(random.nextInt(3000));
	}
}
