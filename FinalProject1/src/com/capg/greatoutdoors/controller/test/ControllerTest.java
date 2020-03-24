package com.capg.greatoutdoors.controller.test;

import com.capg.greatoutdoors.controller.MainController;

public class ControllerTest 
{
	MainController maincontroller = new MainController();
	
	public boolean validChoice(int choiceReport)
	{
		boolean result = false;
		if(choiceReport==1 || choiceReport==2)
		{
			result = true;
		}
		return result;
	}
}


