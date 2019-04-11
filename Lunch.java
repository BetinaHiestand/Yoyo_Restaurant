package com.yoyo;

/**
 * The RestaurantYoYo program implements an application that simulates a visit
 * in a restaurant.
 *
 * @author Betina Hiestand
 */

public class Lunch extends Menu {

	private Boolean vegetarian;

	public Lunch(int menuNumber, String menuName, double menuPrice, Boolean vegetarian) {
		super(menuNumber, menuName, menuPrice);
		this.vegetarian = vegetarian;
	}

	/**
	 * Prints out the Lunch with all its attributes
	 */

	public void print() {
		super.print();
		System.out.println("Vegetarian:               " + vegetarian);
		System.out.println("");

	}

}
