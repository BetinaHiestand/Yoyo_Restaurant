package com.yoyo;

import java.util.InputMismatchException;

/**
* The RestaurantYoYo program implements an application that
* simulates a visit in a restaurant. 
*
* @author  Betina Hiestand
*/

import java.util.Scanner;

public class InputReader {
	
	private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
    	reader = new Scanner(System.in);
        String inputLine = reader.nextLine().toUpperCase();

        return inputLine;
    }
    
	/**
	 * Read an integer from standard input (the text terminal), and return it as an
	 * Integer.
	 *
	 * @return An integer typed by the user.
	 */
    
    public int getInteger() {
    	int inputNumber = 0;
    	boolean okay = false;
    	
    	while (!okay) {
    	
    	try {
    		reader = new Scanner(System.in);
    		inputNumber = reader.nextInt();	
    		okay = true;
    	}
    	catch (InputMismatchException e) {
    		System.out.println("That was not a A Number. Please try again.");
    	}}
    	return inputNumber;
    }


}
