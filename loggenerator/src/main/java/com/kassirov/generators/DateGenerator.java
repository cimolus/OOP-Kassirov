package com.kassirov.generators;

import com.kassirov.models.CurrentDate;
import com.kassirov.models.Date;

public class DateGenerator {
	
	public Date generate() {
		return CurrentDate.getDate();
	}
}
