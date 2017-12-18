package com.nnn.tools.tool2.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Tool2Service {
	private static final Logger log = LogManager.getLogger();

	public String test(String name) {
		return name;
	}
	
}

