package com.tarun.learning.bridge;

public class LongProcessor implements Processor{

	@Override
	public void process(Processable p) {
		
		System.out.println(this.getName() + " is processing a processable with scale "
				+ p.getProcessScale() + " in time " + p.getProcessTime());
	}

	@Override
	public String getName() {
		return "Long Processor";
	}

}
