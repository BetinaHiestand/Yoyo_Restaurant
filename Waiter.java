package com.yoyo;

import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Waiter implements Talking {

	private String name;
	private String answer;
	private boolean menuRequired;
	private int menuNumber = 0;

	ALaCarte carte = new ALaCarte();
	Order order = new Order();

	public Waiter(String name) {
		this.name = name;
	}

	public void welcome() throws InterruptedException {
		System.out.println(
				"Waiter: Welcome to out cozy restaurant! My name is " + name + ". Do you want to see the menu?");
		InputReader input = new InputReader();
		answer = input.getInput();

		if (answer.equals("YES")) {
			System.out.println("Waiter: Okay one moment");
			TimeUnit.SECONDS.sleep(5);
			carte.printCarte();

		}

	}

	public void getOrder() throws InterruptedException {
		
		boolean exit = false;
		
		while (!exit) {

		while (menuNumber == 0  ) {
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Waiter: Which Menu-Number can I bring you? ");
			InputReader input = new InputReader();

			try {
				menuNumber = input.getInteger();
			} catch (InputMismatchException e) {
				System.out.println(
						"Waiter: That was not a Menu-Number. Please tell us which Menu you would like to eat.");
			}
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
	
	public void bringFood() throws InterruptedException {
		
		order.getPreparedmenu();
		System.out.println("Waiter: Your food is ready - here you go!");
		
	}

	@Override
	public void goodbye() {

		System.out.println("Waiter: Thanks for your visit. Hope to see you soon!");

	}

}
