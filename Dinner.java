package com.yoyo;

public class Dinner extends Menu {

	private int minimumNumberOfPerson;
	private boolean vegetarian;

	public Dinner(int menuNumber, String menuName, double menuPrice, int minimumNumberOfPerson, boolean vegetarian) {
		super(menuNumber, menuName, menuPrice);
		this.minimumNumberOfPerson = minimumNumberOfPerson;
		this.vegetarian = vegetarian;
	}

	public void print() {
		super.print();
		System.out.println("Minimum required Persons: " + minimumNumberOfPerson);
		System.out.println("Vegetarian:               " + vegetarian);
		System.out.println("");
	}

}
