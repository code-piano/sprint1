package com.capg.greatoutdoors.controller;
import com.capg.greatoutdoors.service.RevenueGrowthServiceClass;
import java.util.*;

public class MainController 
{

	public static void main(String[] args) 
	{

		int index=0, getMnth=0, choice=0, quaterChoice=0, choiceReport=0;
		double sum=0,sum1=0,percentChange=0,mnthRevenue=0;
		String color;
		RevenueGrowthServiceClass rgs=new RevenueGrowthServiceClass();
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter (1) for growth report. \nEnter (2) for revenue report.");
		choiceReport=obj.nextInt();
		//exception handling if required.
		switch(choiceReport)
		{
		  case 1:
			  System.out.println("Showing Growth report...\n");
		
			System.out.println("Enter month number in integer to calculate it's revenue:");
			
			try
			{
			  getMnth=obj.nextInt();
			  
			  if(getMnth<1 && getMnth>12)
			  throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Input month number from 1 to 12 only ");
			}
			
			//Declaring MonthlyGrowthReport.revenue(getMonth) in DAO
			
			sum=rgs.revenueFun(getMnth);
			System.out.println("The generated revenue is: "+sum);
			
			if((getMnth-1)==0)
				getMnth=12;
			
			//calling revenue(getMonth) in DAO
			
			sum1=rgs.revenueFun(getMnth);

			//sum1=MonthlyGrowthReportDAO.amountOfChange(getMonth-1, sum1);
			
			sum1=rgs.amountChange(getMnth,sum1);
			
			//percentageChange=MonthlyGrowthReportDAO.percentageGrowth(sum,sum1);
			
			percentChange=rgs.perGrowth(sum,sum1);
			
			System.out.println("The percent change is : "+percentChange+"%");
			color=rgs.colCode(percentChange);
			System.out.println("Color code:"+color);
			
			break;
		
		  case 2:
			  
			System.out.println("Showing Revenue report...\n ");
			
			System.out.println("Enter your choice: \n(1) for monthly report. \n(2) for quaterly report. \n(3) for yearly report.");
			choice=obj.nextInt();
			switch(choice)
			{
			  	case 1:
			  		System.out.println("Enter Month no. in integer to check monthly report");
			  		getMnth=obj.nextInt();
				
			  		sum=rgs.revenueFun(getMnth);
			  		System.out.println("The revenue is: "+sum);
			  		break;
				
			  		
			  	case 2:
			  		sum1=sum=0;
			  		getMnth=1;
				
			  		System.out.println("Enter your choice: \n(1) for first quaterly report. \n(2) for 2nd quaterly report. \n(3) for 3rd quaterly report. \n(4) for 4th quaterly report.");
				
			  		quaterChoice=obj.nextInt();
			  		switch(quaterChoice)
			  		{
			  		  case 1:
			  			  index=0;
			  			  System.out.println("First quater revenue report: ");
			  			  while(index<3)
			  			  {
			  				  sum=rgs.revenueFun(getMnth);
			  				  sum1+=sum;
				
			  				  getMnth++;
			  				  index++;
			  			  }
			  			  System.out.println("The revenue is: "+sum1);
			  			  break;
				
			  		  case 2:
			  			  index=3;
			  			  System.out.println("Second quaterly revenue report: ");
			  			  while(index<6)
			  			  {
			  				  sum=rgs.revenueFun(getMnth);
			  				  sum1+=sum;
					
			  				  getMnth++;
			  				  index++;
			  			  }
			  			  System.out.println("The revenue is: "+sum1);
			  			  break;
					
			  		  case 3:
			  			  index=6;
			  			  System.out.println("Third quaterly revenue report: ");
			  			  while(index<9)
			  			  {
			  				  sum=rgs.revenueFun(getMnth);
			  				  sum1+=sum;
					
			  				  getMnth++;
			  				  index++;
			  			  }
			  			  System.out.println("The revenue is: "+sum1);
			  			  break;
					
			  		  case 4:
			  			  index=9;
			  			  System.out.println("Fourth quaterly revenue report: ");
			  			  while(index<12)
			  			  {
			  				  sum=rgs.revenueFun(getMnth);
			  				  sum1+=sum;
			  				  
			  				  getMnth++;
			  				  index++;
			  			  }
			  			  System.out.println("The revenue is: "+sum1);
			  			  break;
			  		}
			  		break;
			  		
			   case 3:
				  sum1=sum=0;
				  getMnth=1;
				  index=0;
				  System.out.println("Yearly revenue report: ");
				  while(index<12)
				  {
					  sum=rgs.revenueFun(getMnth);
					  sum1+=sum;
				
					  getMnth++;
					  index++;
				  }
				  System.out.println("The revenue is: "+sum1);
				  break;
			 }
			  break;
	
			default:
				System.out.println("Invalid Input !");
				break;
		}	
	}	
}