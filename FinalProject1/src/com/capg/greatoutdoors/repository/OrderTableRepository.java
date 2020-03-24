package com.capg.greatoutdoors.repository;

import java.util.*;
//2 more data added

import com.capg.greatoutdoors.bean.OrderProductMap;
import com.capg.greatoutdoors.bean.OrderTable;

public class OrderTableRepository {
	
	static Date d1=new Date(2020/2/12);
	static Date d2=new Date(2020/2/13);
	static Date d3=new Date(2020/2/14);
	static Date d4=new Date(2020/2/15);
	static Date d5=new Date(2020/2/16);
	static Date d6=new Date(2020/1/15);
	static Date d7=new Date(2020/1/16);
	
	public static Map<String,OrderTable> orderTableMap=new HashMap<String,OrderTable>();
	
	//OrderTableRepository()
	static
	{
	//	Storing the data.
	//  order table  name			declaration	  order_id  O_disp_stat user_id   address   ord. initiate tym
		
		OrderTable orderTableObj1 = new OrderTable ("A101",(byte)1,"user101","1, Rohini, New Delhi,100011",d1);
		OrderTable orderTableObj2 = new OrderTable ("B102",(byte)0,"user102","2, Mau Aima, Uttar pradesh,200807",d2);
		OrderTable orderTableObj3 = new OrderTable ("C103",(byte)1,"user103","3, Jalandhar, Punjab,144411",d3);
		OrderTable orderTableObj4 = new OrderTable ("D104",(byte)0,"user104","4, Amritsar, Punjab,123339",d4);
		OrderTable orderTableObj5 = new OrderTable ("E105",(byte)0,"user105","5, Kolkata, West Bengal,311190",d5);
		
		//same user different order feature.
		OrderTable orderTableObj6 = new OrderTable ("A104",(byte)0,"user103","21, Amritsar,Punjab,123339",d6);
		OrderTable orderTableObj7 = new OrderTable ("E105",(byte)0,"user104","39, Kolkata,West Bengal,311190",d7);
		
		orderTableMap.put("A101",orderTableObj1);
		orderTableMap.put("B102",orderTableObj2);
		orderTableMap.put("C103",orderTableObj3);
		orderTableMap.put("D104",orderTableObj4);
		orderTableMap.put("E105",orderTableObj5);
		orderTableMap.put("A104",orderTableObj6);
		orderTableMap.put("E105",orderTableObj7);

     }

}

