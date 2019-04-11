package com.yoyo;

/**
 * The RestaurantYoYo program implements an application that simulates a visit
 * in a restaurant.
 *
 * @author Betina Hiestand
 */

public class Breakfast extends Menu {

	private String ingredients;
	private String allergics;

	public Breakfast(int menuNumber, String menuName, double menuPrice, String ingredients, String allergics) {
		super(menuNumber, menuName, menuPrice);
		this.ingredients = ingredients;
		this.allergics = allergics;
	}

	/**
	 * Prints out the breakfast details
	 *
	 */

	public void print() {
		super.print();
		System.out.println("Ingredients:              " + ingredients);
		System.out.println("Allergics:                " + allergics);
		System.out.println("");
	}

}
