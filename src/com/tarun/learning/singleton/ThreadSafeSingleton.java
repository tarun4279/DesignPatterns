package com.tarun.learning.singleton;

public class ThreadSafeSingleton {

	private static volatile ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {};
	
	public static ThreadSafeSingleton getInstance() {
		
		if(instance == null) {
			
			synchronized (ThreadSafeSingleton.class) {
				instance = new ThreadSafeSingleton();
			}
			
			
		}
		
		return instance;
	}
	
}
