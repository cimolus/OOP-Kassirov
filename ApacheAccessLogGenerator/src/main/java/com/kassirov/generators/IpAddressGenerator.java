package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.IpAddress;

public class IpAddressGenerator {
	
	private IpAddress ipAddress;
	
	private Random random = new Random();
	
	public IpAddress generate() {
		ipAddress = new IpAddress();
		ipAddress.setPart1(random.nextInt(255));
		ipAddress.setPart2(random.nextInt(255));
		ipAddress.setPart3(random.nextInt(255));
		ipAddress.setPart4(random.nextInt(255));
		return ipAddress;
	}
	
}
