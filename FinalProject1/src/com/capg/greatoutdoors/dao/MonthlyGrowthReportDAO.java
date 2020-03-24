package com.capg.greatoutdoors.dao;

import java.time.*;
import java.util.*;

import com.capg.greatoutdoors.bean.WeeklyReport;
import com.capg.greatoutdoors.repository.GrowthReportTableRepository;

public class MonthlyGrowthReportDAO implements daoInterface{
	
//growth report by month
	public Map<Date,WeeklyReport> getMonth(int month)
	{
		
		Map<Date,WeeklyReport> obj=GrowthReportTableRepository.getAllMonthsReport();
		
		Map<Date,WeeklyReport> output=new HashMap<Date, WeeklyReport>();
		
		for(Map.Entry<Date, WeeklyReport>me : obj.entrySet())
		{
			if(me.getKey().getMonth()==month)
			{
			 output.put(me.getKey(), me.getValue());
			}
		}
		return output;
	}
	
	public  double revenue(int month)
	{
		Map<Date,WeeklyReport> output=getMonth(month);
		double totalsaleformonth=0.0;
		
		for(Map.Entry<Date, WeeklyReport>me : output.entrySet())
		{
			totalsaleformonth+=me.getValue().getWeeklySale();
		}
		//System.out.println("in revenue");
		//System.out.println(total sale for month+"\n");
		return totalsaleformonth;
	}
	
	public double amountOfChange(int month,double totalsaleformonth)
	{
		
		Map<Date,WeeklyReport> output=getMonth(month);
		double totalsaleforpremonth=0.0;
	    
		for(Map.Entry<Date, WeeklyReport>me : output.entrySet())
		{
			totalsaleforpremonth+=me.getValue().getWeeklySale();
		}
		double d=(totalsaleformonth-totalsaleforpremonth);
		System.out.println("change is "+d+"\n");
		return d;
	}
	
	public double percentageGrowth(double totalsaleformonth,double totalSaleForPreviousMonth)
	{
		//percentage formula..
		double change= (((totalsaleformonth-totalSaleForPreviousMonth)*100)/totalsaleformonth);
		return change;
	}
	
	public String colourCode(double change)
	{
		if(change<2)
			return "Red";
		else if(2<=change&&change<10)
			return "Blue";
		else if(change>=10)
			return "Green";
		else
			return "--";
	}
}