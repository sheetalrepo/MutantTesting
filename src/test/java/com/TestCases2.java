package com;

import org.junit.Test;
import org.junit.Assert;

public class TestCases2 {

	@Test
	public void testAgePositive() {
		MyCode obj = new MyCode();
		boolean flag = obj.canIVote(20);
		Assert.assertEquals(true, flag);
	}
	
	//just added
	@Test
	public void testAgeNegative() {
		MyCode obj = new MyCode();
		boolean flag = obj.canIVote(10);
		Assert.assertEquals(false, flag);
	}

	
	//@Test
	public void testAgeEqual() {
		MyCode obj = new MyCode();
		boolean flag = obj.canIVote(18);
		Assert.assertEquals(true, flag);
	}

	
}
