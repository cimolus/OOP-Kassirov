package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.IP;

public class IPGenerator {
	
	private Random random = new Random();
	
	public IP generate() {
		int part1 = random.nextInt(255);
		int part2 = random.nextInt(255);
		int part3 = random.nextInt(255);
		int part4 = random.nextInt(255);
		return new IP(part1, part2, part3, part4);
	}
	
}
