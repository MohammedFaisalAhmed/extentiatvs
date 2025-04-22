package com.extentiatvs.utilities;

import java.io.FileInputStream;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil 
{
	static ObjectMapper objectMapper;
	
	public static JsonNode getDataFromJson(String fileName,String arrayName,String key,String value)
	{
		
		
		try 
		{
			objectMapper= new ObjectMapper();
			FileInputStream fileInputStream= new FileInputStream(fileName);
			JsonNode rootNode =objectMapper.readTree(fileInputStream);
			for(JsonNode node:rootNode.get(arrayName))
			{
				
				if(node.get(key).asText().equals(value))
				{
					return node;
				}
			}
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		return null;

		
	}
	
	public static JsonNode getUserDataByProduct(String productName)
	{
		
		return getDataFromJson("src/main/resources/testdata/json/shop.json", "Products", "ProductName", productName);
	}

}
