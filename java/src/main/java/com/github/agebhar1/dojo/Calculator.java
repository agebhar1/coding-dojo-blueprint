package com.github.agebhar1.dojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

	public static int add(int a, int b) {
		logger.debug("invoke add({}, {})", a ,b);
		return a + b;
	}

}
