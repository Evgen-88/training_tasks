package com.epam.jwd.task01;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
	
	@Test
	public void modifyNumber_Poz() {
		Assert.assertTrue(Task1.modifyNumber(2.5) == 6.25);
	}
	
	@Test
	public void modifyNumber_Neg() {
		Assert.assertTrue(Task1.modifyNumber(-2.0) == 16.0);
	}
}
