package com.yoyo;

import java.util.Stack;
import java.util.stream.Stream;

public class Order {

	public static Stack<Integer> orderList = new Stack<Integer>();

	public void placeMenuOrder(int MenuNumber) {

		orderList.push(MenuNumber);
	}

	public void getPreparedmenu() {
		orderList.pop();
	}

	public void showPendingOrders() {

		Stream<Integer> stream = orderList.stream();

		if (orderList.isEmpty()) {
			System.out.println("No pending Orders");
		} else {

			stream.forEach((element) -> {
				System.out.println(""
						+ "---------------------------------");
				System.out.println("Pending Menu Number: " + element + " is currently in production"); // print element
				System.out.println(""
						+ "---------------------------------");
			});
		}

	}

}
