package com.capg.greatoutdoors.service;

import com.capg.greatoutdoors.dao.MonthlyGrowthReportDAO;

public class RevenueGrowthServiceClass  implements revenueInterface {
	MonthlyGrowthReportDAO  da=new MonthlyGrowthReportDAO();
	
	public double revenueFun(int choice)
	{
		
		double d=da.revenue(choice);
		return d;
	}
	
	public double amountChange(int getMonth,double d)
	{
		
		double d1=da.amountOfChange(getMonth-1, d);
		return d1;
	}
	
	public double perGrowth(double d,double d2)
	{
		double d3=da.percentageGrowth(d,d2);
		return d3;
	}
	
	public String colCode(double d)
	{
		String d4=da.colourCode(d);
		return d4;
	}
}
