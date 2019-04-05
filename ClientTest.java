package com.yoyo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
	Client c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Client("Betina");
	}

	@Test
	void testGoodbye() {
		assertEquals("Client: Thank you for the delicous food and goodbye", c.goodbye());
	}

}
