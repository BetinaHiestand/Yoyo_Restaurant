package com.yoyo;

/**
* The RestaurantYoYo program implements an application that
* simulates a visit in a restaurant. 
*
* @author  Betina Hiestand
*/

import java.util.ArrayList;
import java.util.List;

public class ALaCarte {

	public static List<Menu> items = new ArrayList<Menu>();

	/**
	 * Adds a menu to the ArrayList
	 */

	public void addMenu(Menu menu) {
		items.add(menu);
	}

	/**
	 * Prints the ArrayList in form of a Menu
	 */

	public void printCarte() {

		System.out.println("Welcome to Yoyo-Restaurant <3");
		System.out.println("");
		System.out.println("-<3----<3----<3----<3----<3----<3----<3----<3----<3----<3");
		System.out.println("Our Menu ");
		for (Menu menu : items) {
			menu.print();
		}

	}

	/**
	 * Checks the ArrayList for the received menuNumber and and retreive the
	 * MenuName
	 *
	 * @return The required menuName or "na".
	 */

	public String getMenuName(int menunumber) {

		String menuName = "na";

		for (Menu menu : items) {
			if (menu.getMenuNumber() == menunumber)
				menuName = menu.getMenuName();
		}
		return menuName;
	}
}
