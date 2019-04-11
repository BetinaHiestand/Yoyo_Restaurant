package com.yoyo;

/**
* The RestaurantYoYo program implements an application that
* simulates a visit in a restaurant. 
*
* @author  Betina Hiestand
*/

import java.util.Stack;
import java.util.stream.Stream;

public class Order {

	public static Stack<Integer> orderList = new Stack<Integer>();

	/**
	 * Adds the ordered MenuNumber into a Stack in order to simulating the process
	 * of preparing the food
	 *
	 */
	public void placeMenuOrder(int MenuNumber) {

		orderList.push(MenuNumber);
	}

	/**
	 * Removes the ordered MenuNumber from the stack in order to simulate the point
	 * where the meal is prepared
	 */

	public void getPreparedmenu() {
		orderList.pop();
	}

	/**
	 * Displays if there are pending Menues in the stack or not
	 */

	public void showPendingOrders() {

		Stream<Integer> stream = orderList.stream();

		if (orderList.isEmpty()) {
			System.out.println("---------------------------------");
			System.out.println("No pending Orders");
			System.out.println("---------------------------------");
		} else {

			stream.forEach((element) -> {
				System.out.println("---------------------------------");
				System.out.println("Pending Menu Number: " + element + " is currently in production");
				System.out.println("---------------------------------");
			});
		}

	}

}
