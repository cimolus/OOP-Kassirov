package com.kassirov.converters;

import com.kassirov.models.IpAddress;

public class IpAddressConverter {

	public String convertToString(IpAddress ip) {
		return ip.getPart1() + "." + ip.getPart2() + "." + ip.getPart3() + "." + ip.getPart4();
	}

}
