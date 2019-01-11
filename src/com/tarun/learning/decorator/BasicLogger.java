package com.tarun.learning.decorator;

public class BasicLogger implements Logger{

	@Override
	public void log(String s) {
		System.out.print(s);
	}

	
	
}
