package com.yoyo;

public class Breakfast extends Menu {

	private String ingredients;
	private String allergics;

	public Breakfast(int menuNumber, String menuName, double menuPrice, String ingredients, String allergics) {
		super(menuNumber, menuName, menuPrice);
		this.ingredients = ingredients;
		this.allergics = allergics;
	}

	public void print() {
		super.print();
		System.out.println("Ingredients:              " + ingredients);
		System.out.println("Allergics:                " + allergics);
		System.out.println("");
	}

}
