package com.yoyo;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Client implements Talking{
	
	private String name;
	

	public String getName() {
		return name;
	}


	public Client(String name) {
		this.name = name;
	}


	@Override
	public void welcome() throws InterruptedException {
		
		String daytime;
		
		//Checking for current time and deciding which daytime it is 
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if (hour > 6 && hour < 12)
		{
			daytime = "morning";
		}
		else if (hour > 12 && hour < 17) {
			daytime = "afternoon";
		}
		else {
			daytime = "evening";
		}
	
		
		//Say Hello to the Waiter
		System.out.println("Client: Good " + daytime);
		TimeUnit.SECONDS.sleep(2);
		
	}


	@Override
	public void goodbye() {
		System.out.println("Client: Thank you for the delicous food and goodbye");
		
	}

}
