package com.yoyo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WaiterTest {
	
	Waiter w;
	Order o;
	Creator c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Creator();
		c.createEverything();
		w = new Waiter("James");
		o = new Order();
		o.placeMenuOrder(2);
	
	}

	@Test
	void testBringFood() throws InterruptedException {
		assertEquals("Waiter: Your food is ready - here you go!", w.bringFood());
	}

	@Test
	void testGoodbye() {
		assertEquals("Waiter: Thanks for your visit. Hope to see you soon!", w.goodbye());
	}

}
