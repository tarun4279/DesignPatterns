package com.tarun.learning.strategy;

public class G1GC implements GarbageCleaner{

	// https://www.dynatrace.com/news/blog/understanding-g1-garbage-collector-java-9/
	
	@Override
	public void clean() {
		System.out.println("Received a request to clean up using G1GC");
	}
}
