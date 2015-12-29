package com.yash.practice.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Demo {
	static final Logger LOGGER =Logger.getLogger(Demo.class.getName());
	void demo(){
		LOGGER.info("demo method called");
		memo();
	}
	void memo(){
		LOGGER.setLevel(Level.WARN);
		LOGGER.warn("THIS IS MEMO METHOD");
		LOGGER.info("This is info in memo");
	}
}
