package com.yoyo;

public class Lunch extends Menu {

	private Boolean vegetarian;

	public Lunch(int menuNumber, String menuName, double menuPrice, Boolean vegetarian) {
		super(menuNumber, menuName, menuPrice);
		this.vegetarian = vegetarian;
	}

	public void print() {
		super.print();
		System.out.println("Vegetarian:               " + vegetarian);
		System.out.println("");

	}

}
