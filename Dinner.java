package com.yoyo;

/**
 * The RestaurantYoYo program implements an application that simulates a visit
 * in a restaurant.
 *
 * @author Betina Hiestand
 */

public class Dinner extends Menu {

	private int minimumNumberOfPerson;
	private boolean vegetarian;

	public Dinner(int menuNumber, String menuName, double menuPrice, int minimumNumberOfPerson, boolean vegetarian) {
		super(menuNumber, menuName, menuPrice);
		this.minimumNumberOfPerson = minimumNumberOfPerson;
		this.vegetarian = vegetarian;
	}

	/**
	 * Prints out the Dinner with all its attributes
	 *
	 */

	public void print() {
		super.print();
		System.out.println("Minimum required Persons: " + minimumNumberOfPerson);
		System.out.println("Vegetarian:               " + vegetarian);
		System.out.println("");
	}

}
