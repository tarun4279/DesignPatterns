package com.tarun.learning.decorator;

public class RedColorLogger extends LoggerDecorator{

	public RedColorLogger(Logger logger) {
		super(logger);
	}

	
	@Override
	public void log(String s) {
		System.err.print("In Red");
		super.log(s);
	}
	
}
