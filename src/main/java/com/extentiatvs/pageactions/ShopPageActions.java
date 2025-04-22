package com.extentiatvs.pageactions;

import org.openqa.selenium.WebDriver;

import com.extentiatvs.pageobjects.ShopPage;
import com.extentiatvs.utilities.JsonUtil;
import com.extentiatvs.utilities.WebElementUIHelperUtil;
import com.fasterxml.jackson.databind.JsonNode;

public class ShopPageActions 
{
	
	ShopPage shopPage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public ShopPageActions(WebDriver driver)
	{
		shopPage= new ShopPage(driver);
		webElementUIHelperUtil = new WebElementUIHelperUtil(driver);
		
	}
	
	/*public void selectAnyProductFromAccessoriesAndMerchandise(String productName)
	{
		
		
		
		webElementUIHelperUtil.implicitWaitAndClick(shopPage.getAccessoriesAndMerchandiseProduct(productName));
	}*/
	
	public void selectAnyProductFromAccessoriesAndMerchandise(String productName)
	{
		
		JsonNode data =JsonUtil.getUserDataByProduct(productName);
		String nameoftheProduct = data.get("NameoftheProduct").asText();
		
		webElementUIHelperUtil.implicitWaitAndClick(shopPage.getAccessoriesAndMerchandiseProduct(nameoftheProduct));
		
		
		
		
		
	}
	

}
