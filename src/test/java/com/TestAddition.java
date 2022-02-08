package com;

import org.junit.Assert;
import org.junit.Test;

public class TestAddition {

	@Test
	public void testAddition1() {
		Addition obj = new Addition();
		int result = obj.addition(10, 20);
		Assert.assertEquals(30, result);
	}

}
