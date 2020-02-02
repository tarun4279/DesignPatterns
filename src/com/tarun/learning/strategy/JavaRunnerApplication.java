package com.tarun.learning.strategy;

import java.util.Scanner;

public class JavaRunnerApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Running an java application");
		System.out.println("Input 1 to choose G1GC and 2 for Serial Garbage Collector");
		int input = scanner.nextInt();
		
		scanner.close();
		
		GarbageCleaner cleaner;
		
		switch (input) {
			case 1:
				cleaner = new G1GC();
				break;
			
			case 2:
				cleaner = new SerialGarbageCollector();
				break;
	
			default:
				throw new RuntimeException("Invalid Input");				
		}
		
		
		
		runJavaApplication(cleaner);
	}
	
	private static void runJavaApplication(GarbageCleaner cleaner) {
		new Application(cleaner).run();
	}

}
