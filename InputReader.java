package com.yoyo;

import java.util.Scanner;

public class InputReader {
	
	private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        String inputLine = reader.nextLine().toUpperCase();

        return inputLine;
    }
    
    public Integer getInteger() {
    	Integer inputNumber = reader.nextInt();
    	
    	return inputNumber;
    }


}
