package com.yoyo;

import java.util.concurrent.TimeUnit;

public class Creator {

	public void createEverything() throws InterruptedException {

		// Creating Breakfast
		Breakfast eggs = new Breakfast(1, "Fried eggs", 6.50, "eggs", "none");
		Breakfast pancakes = new Breakfast(2, "Pancakes with chocolate chips", 12.00, "flour, eggs, chocolate, sugar",
				"flour");
		Breakfast toast = new Breakfast(3, "Toast with nutella", 05.00, "toast, nutella, sugar", "flour");

		// Creating Lunch
		Lunch spaghetti = new Lunch(4, "Spaghetti Carbonara", 15.90, false);
		Lunch risotto = new Lunch(5, "Mushroom Risotto", 13.95, true);
		Lunch steak = new Lunch(6, "Beef steak", 30.00, false);

		// Creating Dinner
		Dinner salmonPasta = new Dinner(7, "Penne with salmon", 18.70, 1, false);
		Dinner fondue = new Dinner(8, "Cheese Fondue", 45.00, 4, true);

		// Creating client & Waiter
		Client client = new Client("Mister X");
		Waiter waiter = new Waiter("James");

		// Adding Meals to the Menu
		ALaCarte wonderfulMenu = new ALaCarte();

		wonderfulMenu.addMenu(eggs);
		wonderfulMenu.addMenu(pancakes);
		wonderfulMenu.addMenu(toast);
		wonderfulMenu.addMenu(spaghetti);
		wonderfulMenu.addMenu(risotto);
		wonderfulMenu.addMenu(steak);
		wonderfulMenu.addMenu(salmonPasta);
		wonderfulMenu.addMenu(fondue);

		// Client&Waiter Interaction

		client.welcome();
		waiter.welcome();
		waiter.getOrder();

		Order order = new Order();
		TimeUnit.SECONDS.sleep(2);
		order.showPendingOrders();
		TimeUnit.SECONDS.sleep(5);
		waiter.bringFood();
		TimeUnit.SECONDS.sleep(2);
		order.showPendingOrders();
		TimeUnit.SECONDS.sleep(5);
		client.goodbye();
		waiter.goodbye();

	}

}
