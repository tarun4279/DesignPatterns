package com.tarun.learning.bridge;

public class ItemB extends Processable{
	
	@Override
	public int getProcessTime() {
		System.out.println("Getting process time for item B");
		return 5;
	}

	@Override
	public int getProcessScale() {
		System.out.println("Getting process scale for item B");
		return 2;
	}
	
}
