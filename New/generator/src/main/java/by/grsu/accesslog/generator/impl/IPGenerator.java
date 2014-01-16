package by.grsu.accesslog.generator.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IIPGenerator;
import by.grsu.accesslog.model.IP;

@Component
public class IPGenerator implements IIPGenerator {
	
	@Autowired
	private Random random;
	
	public IP generate() {
		int part1 = random.nextInt(255);
		int part2 = random.nextInt(255);
		int part3 = random.nextInt(255);
		int part4 = random.nextInt(255);
		return new IP(part1, part2, part3, part4);
	}
	
}
