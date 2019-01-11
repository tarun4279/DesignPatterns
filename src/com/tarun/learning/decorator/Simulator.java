package com.tarun.learning.decorator;

public class Simulator {

	public static void main(String[] args) {
		Logger logger = new BoldLogger(new RedColorLogger(new BasicLogger()));
		logger.log("tarun");
	}

}
