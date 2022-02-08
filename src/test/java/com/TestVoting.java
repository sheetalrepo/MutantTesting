package com;

import org.junit.Test;
import org.junit.Assert;

public class TestVoting {

	@Test
	public void testVote1() {
		Vote obj = new Vote();
		boolean flag = obj.canIVote(20);
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testVote2() {
		Vote obj = new Vote();
		boolean flag = obj.canIVote(10);
		Assert.assertEquals(false, flag);
	}

	@Test
	public void testVote3() {
		Vote obj = new Vote();
		boolean flag = obj.canIVote(18);
		Assert.assertEquals(true, flag);
	}

}
