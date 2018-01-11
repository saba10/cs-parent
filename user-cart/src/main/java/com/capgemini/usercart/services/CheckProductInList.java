package com.capgemini.usercart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.usercart.model.ProductCartModel;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckProductInList {
	
	@Autowired
	static MongoRepositoryDataBaseOperations  mongoRepositoryDataBaseOperations;
	
	public static int getUserDetail(List<ProductCartModel> list, String productId)
	{
		int index=list.size()+2;
		try{
			
				for (int i=0; i<list.size(); i++) {
				
				if(list.get(i).getProductId().equalsIgnoreCase(productId))
				{
					index=i;
					break;
				}
			}
				return index;
		}
		catch(Exception e)
		{
			log.info("Error occured while CheckProductInList");
			return index;
		}
		
	}
}
