package com.yoyo;

public class Creator {
	
	public void createEverything() {
		
		//Creating Breakfast
		Breakfast eggs = new Breakfast(1, "Fried eggs", 6.50, "eggs", "none");
		Breakfast pancakes = new Breakfast(2, "Pancakes with chocolate chips", 12.00, "flour, eggs, chocolate, sugar", "flour");
		Breakfast toast = new Breakfast(3, "Toast with nutella", 05.00, "toast, nutella, sugar", "flour");
		
		
		//Creating Lunch
		Lunch spaghetti = new Lunch(4, "Spaghetti Carbonara", 15.90, false);
		Lunch risotto = new Lunch(5, "Mushroom Risotto", 13.95, true);
		Lunch steak = new Lunch(6, "Beef steak", 30.00, false);
				
						
		//Creating Dinner
		Dinner salmonPasta = new Dinner(7, "Penne with salmon", 18.70, 1, false);
		Dinner fondue = new Dinner(8, "Cheese Fondue", 45.00, 4, true);
	
		
		
		//Adding Meals to the Menu
		ALaCarte wonderfulMenu = new ALaCarte();
		wonderfulMenu.addMenu(eggs);
		wonderfulMenu.addMenu(pancakes);
		wonderfulMenu.addMenu(toast);
		wonderfulMenu.addMenu(spaghetti);
		wonderfulMenu.addMenu(risotto);
		wonderfulMenu.addMenu(steak);
		wonderfulMenu.addMenu(salmonPasta);
		wonderfulMenu.addMenu(fondue);
		
		wonderfulMenu.printCarte();
		
		
	
		
	}

}
