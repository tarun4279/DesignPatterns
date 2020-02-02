package com.tarun.learning.strategy;

public class SerialGarbageCollector implements GarbageCleaner{

	// https://dzone.com/articles/garbage-collectors-serial-vs-0
	
	@Override
	public void clean() {
		System.out.println("Received a request to clean up"
				+ " using Serial Garbage Collector");
	}

}
