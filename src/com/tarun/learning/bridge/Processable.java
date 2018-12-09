package com.tarun.learning.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an entity on which process can be performed 
 * @author tarun.kundhiya
 *
 */
public abstract class Processable {

	private List<Processor> processors = new ArrayList<>();
	
	public abstract int getProcessTime();
	
	public abstract int getProcessScale();
	
	public void addProcessor(Processor p) {
		this.processors.add(p);
	}
	
	public List<Processor> getProcessors(){
		return this.processors;
	}
	
	public void getProcessed() {
		for(Processor p : this.getProcessors()) {
			p.process(this);
		}
	}
}
