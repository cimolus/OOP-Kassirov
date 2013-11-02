package com.kassirov.models;

import java.util.Random;

public class IpAddress {
	private int part1;
	private int part2;
	private int part3;
	private int part4;
	
	public IpAddress( int part1, int part2, int part3, int part4 ) {
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
	}
	
	public int getPart1() {
		return part1;
	}

	public void setPart1(int part1) {
		this.part1 = part1;
	}

	public int getPart2() {
		return part2;
	}

	public void setPart2(int part2) {
		this.part2 = part2;
	}

	public int getPart3() {
		return part3;
	}

	public void setPart3(int part3) {
		this.part3 = part3;
	}

	public int getPart4() {
		return part4;
	}

	public void setPart4(int part4) {
		this.part4 = part4;
	}

}
