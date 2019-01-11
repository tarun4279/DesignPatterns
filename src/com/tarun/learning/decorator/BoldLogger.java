package com.tarun.learning.decorator;

public class BoldLogger extends LoggerDecorator{

	public BoldLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String s) {
		System.out.print("<bold>");
		super.log(s);
		System.out.print("</bold>");
	}
}
