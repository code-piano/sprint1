package com.capg.greatoutdoors.repository;

import java.util.*;

import com.capg.greatoutdoors.bean.ProductTable;

public class ProductTableRepository {
	
	public static Map<String,ProductTable> productTableMap=new HashMap<String,ProductTable>();
	
	//ProductTableRepository()
	static
	{
		//			DECLARATION							PROD ID PRICE COLOR SHAPE QT. SPECIFICATION       PROD CAT.  MANUFACTURER  PROD. NAME    		
		
		ProductTable productTableObj1= new ProductTable("Pro01",15.20,"black","circle",2,"Limited stock",3,"Made in India","Personal Accessories"); 
		ProductTable productTableObj2= new ProductTable("Pro02",10.10,"blue","circle",15,"In stock",3,"Made in India","Outdoor Protection"); 
		ProductTable productTableObj3= new ProductTable("Pro03",1.70,"brown","rectangle",20,"Out of stock",2,"Made in India","Camping Equipment"); 
		ProductTable productTableObj4= new ProductTable("Pro04",4.90,"white","rectangle",2,"Limited stock",2,"Made in India","Golf Equipment"); 
		ProductTable productTableObj5= new ProductTable("Pro05",23.30,"black","cone",8,"Limited stock",3,"Made in India","Mountaineering"); 
		ProductTable productTableObj6= new ProductTable("Pro06",4.90,"white","rectangle",2,"Limited stock",2,"Made in India","Golf Equipment"); 
		ProductTable productTableObj7= new ProductTable("Pro07",23.30,"black","cone",8,"Limited stock",3,"Made in India","Mountaineering"); 
		
		
		productTableMap.put("Pro01",productTableObj1);
		productTableMap.put("Pro02",productTableObj2);
		productTableMap.put("Pro03",productTableObj3);
		productTableMap.put("Pro04",productTableObj4);
		productTableMap.put("Pro05",productTableObj5);
		productTableMap.put("Pro06",productTableObj6);
		productTableMap.put("Pro07",productTableObj7);
		
	}
	
	
}
