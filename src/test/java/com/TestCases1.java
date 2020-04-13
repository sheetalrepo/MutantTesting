package com;

import org.junit.Assert;
import org.junit.Test;

public class TestCases1 {

	@Test
	public void testAddition1() {
		MyCode obj = new MyCode();
		int result = obj.addition(10, 20);
		Assert.assertEquals(30, result);
	}

}
