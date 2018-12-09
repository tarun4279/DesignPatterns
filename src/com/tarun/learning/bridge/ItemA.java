package com.tarun.learning.bridge;


public class ItemA extends Processable {

	@Override
	public int getProcessTime() {
		System.out.println("Getting process time for item A");
		return 10;
	}

	@Override
	public int getProcessScale() {
		System.out.println("Getting process scale for item A");
		return 1;
	}
}
