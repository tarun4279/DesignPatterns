package com.tarun.learning.adapter;

public class Stupid2CivilAdapter implements QueueLineWalker{

	private StupidMan stupidMan;
	
	public Stupid2CivilAdapter(StupidMan stupidMan) {
		this.stupidMan = stupidMan;
	}
	
	
	@Override
	public void moveInQueue() {
		stupidMan.moveForward();
	}

}
