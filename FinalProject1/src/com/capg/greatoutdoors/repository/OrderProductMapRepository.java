package com.capg.greatoutdoors.repository;

import java.util.*;

import com.capg.greatoutdoors.bean.OrderProductMap;

//2 more data added

public class OrderProductMapRepository {
	
	public  Map<String,OrderProductMap> OrderProductMaps=new HashMap<String, OrderProductMap>();
	
	
	OrderProductMapRepository()

	{
		//					DECLARATION						ORDER_ID  PROD_ID  PROD_UNIQ._ID DISPATCH RECIEVE STATUS
		OrderProductMap OrderProductMapObj1= new OrderProductMap("A101","Pro01","23AAAES101",1,0);
		OrderProductMap OrderProductMapObj2= new OrderProductMap("B102","Pro02","23AAAES101",1,1);
		OrderProductMap OrderProductMapObj3= new OrderProductMap("C103","Pro03","23AAAES101",0,0);
		OrderProductMap OrderProductMapObj4= new OrderProductMap("D104","Pro04","23AAAES101",0,1);
		OrderProductMap OrderProductMapObj5= new OrderProductMap("E105","Pro05","23AAAES101",1,0);
		
		OrderProductMap OrderProductMapObj6= new OrderProductMap("A104","Pro06","23AAAES101",0,1);
		OrderProductMap OrderProductMapObj7= new OrderProductMap("E105","Pro07","23AAAES101",1,0);
		

		OrderProductMaps.put("A101",OrderProductMapObj1);
		OrderProductMaps.put("D102",OrderProductMapObj2);
		OrderProductMaps.put("C103",OrderProductMapObj3);
		OrderProductMaps.put("D104",OrderProductMapObj4);
		OrderProductMaps.put("E105",OrderProductMapObj5);
		
		OrderProductMaps.put("A104",OrderProductMapObj6);
		OrderProductMaps.put("E105",OrderProductMapObj7);
	}

}
