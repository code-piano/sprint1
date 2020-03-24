package com.capg.greatoutdoors.dao;

import java.util.Date;
import java.util.Map;

import com.capg.greatoutdoors.bean.WeeklyReport;

public interface daoInterface 
{
	public  Map<Date,WeeklyReport> getMonth(int month);
	public double revenue(int month);
	public double amountOfChange(int month,double totalsaleformonth);
	public double percentageGrowth(double totalsaleformonth,double totalSaleForPreviousMonth);
	public String colourCode(double change);
}
