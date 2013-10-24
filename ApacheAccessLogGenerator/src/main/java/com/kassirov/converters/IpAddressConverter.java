package com.kassirov.converters;

import com.kassirov.models.IpAddress;

public class IpAddressConverter {

	public String convertToString(Object object) {
		IpAddress ip = (IpAddress) object;
		return ip.getPart1() + "." + ip.getPart2() + "." + ip.getPart3() + "." + ip.getPart4();
	}

}
