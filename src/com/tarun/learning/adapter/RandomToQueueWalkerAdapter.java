package com.tarun.learning.adapter;

public class RandomToQueueWalkerAdapter implements QueueLineWalker{

	private RandomWalker randomWalker;
	
	public RandomToQueueWalkerAdapter(RandomWalker randomWalker) {
		this.randomWalker = randomWalker;
	}
	
	
	@Override
	public void moveInQueue() {
		this.randomWalker.moveForward();
	}

}
