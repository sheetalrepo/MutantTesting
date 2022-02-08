package com;

import org.junit.Assert;
import org.junit.Test;

public class TestDrive {

	@Test
	public void testDrive1() {
		Drive obj = new Drive();
		boolean flag = obj.canIDrive(20, true);
		Assert.assertEquals(true, flag);
	}

	
	@Test
	public void testDrive2() {
		Drive obj = new Drive();
		boolean flag = obj.canIDrive(20, false);
		Assert.assertEquals(false, flag);
	}
	
	@Test
	public void testDrive3() {
		Drive obj = new Drive();
		boolean flag = obj.canIDrive(10, false);
		Assert.assertEquals(false, flag);
	}

	@Test
	public void testDrive4() {
		Drive obj = new Drive();
		boolean flag = obj.canIDrive(18, true);
		Assert.assertEquals(true, flag);
	}
	
	//@Test
	public void testDrive5() {
		Drive obj = new Drive();
		boolean flag = obj.canIDrive(18, false);
		Assert.assertEquals(false, flag);
	}

}
