package com.yoyo;

public class Menu {

	private int menuNumber;
	private String menuName;
	private double menuPrice;

	public Menu(int menuNumber, String menuName, double menuPrice) {
		this.menuNumber = menuNumber;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	/**
	 * Prints out the Menu with its attributes
	 */

	public void print() {
		System.out.println("---------------------------------------------------------");
		System.out.println("Menu Number: " + menuNumber + " Description: " + menuName);
		System.out.println("---------------------------------------------------------");
		System.out.println("Price:                    " + menuPrice);
	}

	public String getMenuName() {
		return menuName;
	}

	public int getMenuNumber() {
		return menuNumber;
	}

}
