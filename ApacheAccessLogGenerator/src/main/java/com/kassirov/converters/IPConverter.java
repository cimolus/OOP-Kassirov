package com.kassirov.converters;

import com.kassirov.models.IP;

public class IPConverter {

	public String convertToString(IP ip) {
		return ip.getPart1() + "." + ip.getPart2() + "." + ip.getPart3() + "." + ip.getPart4();
	}

}
