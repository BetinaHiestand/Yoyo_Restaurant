package com.yoyo;

/**
* The RestaurantYoYo program implements an application that
* simulates a visit in a restaurant. 
*
* @author  Betina Hiestand
*/

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Client implements Talking {

	private String name;
	private String daytime;

	// Checking for current time
	Calendar now = Calendar.getInstance();
	int hour = now.get(Calendar.HOUR_OF_DAY);

	public Client(String name) {
		this.name = name;
	}

	/**
	 * Prints out a greeting depending of the current daytime and waits 2 seconds to
	 * simulate a conversation
	 *
	 */

	@Override
	public void welcome() throws InterruptedException {

		// Deciding which daytime it is

		if (hour > 6 && hour < 12) {
			daytime = "morning";
		} else if (hour > 12 && hour < 17) {
			daytime = "afternoon";
		} else {
			daytime = "evening";
		}

		// Say Hello to the Waiter
		System.out.println("Client: Good " + daytime);
		TimeUnit.SECONDS.sleep(2);

	}

	/**
	 * Contains a goodbye from the client
	 * 
	 * @return gives back the goodbye String
	 */

	@Override
	public String goodbye() {
		String answer = "Client: Thank you for the delicous food and goodbye";
		return answer;

	}

	public String getName() {
		return name;
	}

}
