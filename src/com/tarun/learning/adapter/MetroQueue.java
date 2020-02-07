package com.tarun.learning.adapter;

import java.util.ArrayList;
import java.util.List;

public class MetroQueue {

	
	public static List<QueueLineWalker> TRAVELLERS = new ArrayList<>();
	
	public static void main(String[] args) {
		
		StupidMan man = new StupidMan();
		
		add(new Stupid2CivilAdapter(man));
		
	}
	
	static void add(QueueLineWalker walker) {
		TRAVELLERS.add(walker);
	}
	
}
