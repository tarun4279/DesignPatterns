package com.tarun.learning.builder;

import java.util.List;

public class Pizza {

	private String name;
	private String base;
	private List<String> toppings;
	private int spicyLevel;
	private int cheeseLevel;
	
	private Pizza() {};
	
	public static class PizzaBuilder {
	
		private Pizza pizza;
		
		public PizzaBuilder(String base, String name) {
			this.pizza = new Pizza();
			this.pizza.base = base;
			this.pizza.name = "special-".concat(name);
		}
		
		public PizzaBuilder(String base) {
			this("",base);
		}
		
		public PizzaBuilder addToppings(List<String> toppings) {
			
			toppings.add("secretTopping");
			this.pizza.toppings = toppings;
			
			return this;
		}
		
		public PizzaBuilder addSpices(int level) {
			this.pizza.spicyLevel = level + 2;
			return this;
		}
		
		public PizzaBuilder addCheese(int level) {
			this.pizza.cheeseLevel = level + 1;
			return this;
		}
		
		public Pizza build() {
			doSecretCustomWork(this.pizza);
			return this.pizza;
		}
		
		private void doSecretCustomWork(Pizza pizza) {}
	}

	public String getName() {
		return name;
	}

	public String getBase() {	
		return base;
	}


	public List<String> getToppings() {
		return toppings;
	}


	public int getSpicyLevel() {
		return spicyLevel;
	}

	private int getCheeseLevel() {
		return cheeseLevel;
	}
	
}
