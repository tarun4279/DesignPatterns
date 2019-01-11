package com.tarun.learning.factory;

import java.util.List;

import com.tarun.learning.builder.Pizza;
import com.tarun.learning.builder.Pizza.PizzaBuilder;

public class PizzaFactory {

	private static PizzaBuilder wheatBasedPizzaBuilder = new Pizza.PizzaBuilder("wheat");
	private static PizzaBuilder cornBasedPizzaBuilder = new Pizza.PizzaBuilder("corn");
	
	private static PizzaBuilder wheatBasedSpicyPizzaBuilder = new Pizza.PizzaBuilder("wheat").addSpices(10);

	public static Pizza getWheatBased(List<String> toppings) {
		return wheatBasedPizzaBuilder.addToppings(toppings).build();
	}
	
	public static Pizza getWheatBasedSpicyPizza(List<String> toppings) {
		return wheatBasedSpicyPizzaBuilder.addToppings(toppings).build();
	}
	
	public static Pizza getCornBased(List<String> toppings) {
		return cornBasedPizzaBuilder.addToppings(toppings).build();
	}
}
