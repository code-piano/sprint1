package com.capg.greatoutdoors.controller.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class ControllerTestcases 
{
	ControllerTest goController;
	
	@Before
	public void SetUp()
	{
		goController = new ControllerTest();
		//object creation of class that includes the methods.
	}
	
	@Test
	void testcheckChoice() 
	{
		Assert.assertEquals(true, goController.validChoice(1));
	}

}
