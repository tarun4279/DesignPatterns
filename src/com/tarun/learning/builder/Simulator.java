package com.tarun.learning.builder;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

	public static void main(String[] args) {

		List<String> toppings = new ArrayList<>();
		toppings.add("chicken");
		toppings.add("corn");
		
		Pizza pizza = new Pizza.PizzaBuilder("test-base", "test-pizza")
											  .addCheese(2)
											  .addSpices(3)
											  .addToppings(toppings)
											  .build();
		System.out.println(pizza.getName());
	}

}
