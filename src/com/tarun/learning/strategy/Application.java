package com.tarun.learning.strategy;

public class Application {

	private GarbageCleaner cleaner;
	
	public Application(GarbageCleaner cleaner) {
		this.cleaner = cleaner;
	}
	
	public void run() {
		this.cleaner.clean();
		System.out.println("Running the main application after cleaning");
	}
}
