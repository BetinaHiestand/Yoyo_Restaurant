package com.yoyo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ALaCarteTest {
	Creator c;
	ALaCarte a;

	@BeforeEach
	void setUp() throws Exception {
		c = new Creator();
		a = new ALaCarte();
		c.createEverything();
	}

	@Test
	void testGetMenuName() {
		assertEquals("Fried eggs", a.getMenuName(1));
	}
	
	@Test
	void testUnavailableMenuName() {
		assertEquals("na", a.getMenuName(13));
	}

}
