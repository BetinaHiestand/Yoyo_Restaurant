package com.yoyo;

/**
* The RestaurantYoYo program implements an application that
* simulates a visit in a restaurant. 
*
* @author  Betina Hiestand
*/

import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Waiter implements Talkable {

	private String name;
	private String answer;
	private int menuNumber = 0;

	ALaCarte carte = new ALaCarte();
	Order order = new Order();
	InputReader input = new InputReader();

	public Waiter(String name) {
		this.name = name;
	}

	/**
	 * Simulates the welcome in the restaurant and asks the client if he wants to
	 * see the menu. Depending on the answer the menu is printed or not
	 * 
	 */
	public void welcome() throws InterruptedException {
		System.out.println(
				"Waiter: Welcome to out cozy restaurant! My name is " + name + ". Do you want to see the menu?");
		// InputReader input = new InputReader();
		answer = input.getInput();

		if (answer.equals("YES")) {
			System.out.println("Waiter: Okay one moment");
			TimeUnit.SECONDS.sleep(5);
			carte.printCarte();

		}

	}

	/**
	 * Asks the Client which menu he wants until he decides for a valid number.
	 * places the number in the Order-Stack.
	 */

	public void getOrder() throws InterruptedException {

		boolean exit = false;

		while (!exit) {

			while (menuNumber == 0) {
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Waiter: Which Menu-Number can I bring you? ");

				menuNumber = input.getInteger();

			}

			if (menuNumber != 0) {

				String menuName = carte.getMenuName(menuNumber);
				if (menuName.equals("na")) {
					menuNumber = 0;
					System.out.println("Waiter: That was not a valid Menu Number. Please check again.");
				} else {
					System.out.println("Waiter: We will serve your " + menuName + " as soon as it is prepared");
					order.placeMenuOrder(menuNumber);
					exit = true;
				}
			}
		}
	}

	/**
	 * Removes the menu from the Order-Stack and print the information for the
	 * client
	 *
	 * @return A String saying that the food is ready.
	 */
	public String bringFood() throws InterruptedException {

		order.getPreparedmenu();
		String answer = "Waiter: Your food is ready - here you go!";
		return answer;

	}

	/**
	 * Says goodbye to the client
	 *
	 * @return An String containing the goodbye.
	 */

	@Override
	public String goodbye() {

		String answer = "Waiter: Thanks for your visit. Hope to see you soon!";
		return answer;
	}

}
