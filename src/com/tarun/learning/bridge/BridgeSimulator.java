package com.tarun.learning.bridge;

public class BridgeSimulator {

	
	public static void main(String[] args) {
		
		Processable itemA = new ItemA();
		Processable itemB = new ItemB();
		
		Processor longProcessor = new LongProcessor();
		Processor shortProcessor = new ShortProcessor();
		
		itemA.addProcessor(shortProcessor);
		itemB.addProcessor(shortProcessor);
		itemB.addProcessor(longProcessor);
		
		itemA.getProcessed();
		itemB.getProcessed();
	}
	
	
	
}
