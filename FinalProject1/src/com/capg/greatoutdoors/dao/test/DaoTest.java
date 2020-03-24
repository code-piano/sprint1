package com.capg.greatoutdoors.dao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capg.greatoutdoors.dao.MonthlyGrowthReportDAO;

public class DaoTest {
	
	MonthlyGrowthReportDAO da = new MonthlyGrowthReportDAO();
		@Test
		public void revenueTestCase1()
		{
			double str=3700.0;
			
			assertEquals((str),da.revenue(1),0);
		}
	
		@Test
		public void revenueTestCase2()
		{
			double str2=8850.0;
			assertEquals(str2,da.revenue(2),1);
		}
		
		@Test
		public void monthgrowthCase1()
		{
			double str=-5150.0;
			assertEquals(str,da.amountOfChange(1, 8850.0),1);
		}

		@Test
		public void percentageChangeCase1()
		{
			double str=158.19209039548022-100;
			assertEquals(str,da.percentageGrowth(8850.0,3700.0),1);
		}
	
		@Test
		public void percentageChangeCase2()
		{
			double str=7.608695652173913-100;
			assertEquals(str,da.percentageGrowth(4600.0,8850.0),1);
		}
		
		@Test
		public void colourCodeTest() {
			String str ="Blue";
			assertEquals(str,da.colourCode(7.608695652173913));
		}
		
		@Test
		public void colourCodeTest2()
		{
			String str="Green";
			assertEquals(str,da.colourCode(158.19209039548022));
		}		
}