package com.tarun.learning.decorator;

public class LoggerDecorator implements Logger{

	private Logger logger;
	
	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public void log(String s) {
		this.logger.log(s);
	}

}
