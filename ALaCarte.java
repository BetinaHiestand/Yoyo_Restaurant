package com.yoyo;

import java.util.ArrayList;
import java.util.List;

public class ALaCarte {

	public static List<Menu> items = new ArrayList<Menu>();

	public void addMenu(Menu menu) {
		items.add(menu);
	}

	public void printCarte() {

		System.out.println("Welcome to Yoyo-Restaurant <3");
		System.out.println("");
		System.out.println("-<3----<3----<3----<3----<3----<3----<3----<3----<3----<3");
		System.out.println("Our Menu ");
		for (Menu menu : items) {
			menu.print();
		}

	}
	
	public String getMenuName (int menunumber) {
		
		String menuName = "na";
		
		for (Menu menu : items) {
			
			if (menu.getMenuNumber() == menunumber)
			menuName = menu.getMenuName();
			
		}
		
		return menuName ; 
		
		
	}
}
