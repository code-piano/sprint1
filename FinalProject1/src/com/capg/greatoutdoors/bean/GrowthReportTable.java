package com.capg.greatoutdoors.bean;

public class GrowthReportTable 
{
				
		/*Date d1=new Date(2020/2/12);
		Date d2=new Date(2020/2/13);
		Date d3=new Date(2020/2/14);
		Date d4=new Date(2020/2/15);
		Date d5=new Date(2020/2/16);*/
		
		String period;
		double revenue, amtChange, percentGrowth;
		String colrCode;
		
		
		public GrowthReportTable(String period, double revenue, double amtChange, double percentGrowth,
				String colrCode) {
			super();
			this.period = period;
			this.revenue = revenue;
			this.amtChange = amtChange;
			this.percentGrowth = percentGrowth;
			this.colrCode = colrCode;
		}

		public String getPeriod() {
			return period;
		}


		public void setPeriod(String period) {
			this.period = period;
		}


		public double getRevenue() {
			return revenue;
		}


		public void setRevenue(double revenue) {
			this.revenue = revenue;
		}


		public double getAmtChange() {
			return amtChange;
		}


		public void setAmtChange(double amtChange) {
			this.amtChange = amtChange;
		}


		public double getPercentGrowth() {
			return percentGrowth;
		}


		public void setPercentGrowth(double percentGrowth) {
			this.percentGrowth = percentGrowth;
		}


		public String getColrCode() {
			return colrCode;
		}


		public void setColrCode(String colrCode) {
			this.colrCode = colrCode;
		}	
}
