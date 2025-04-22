package com.extentiatvs.pageactions;

import org.openqa.selenium.WebDriver;

import com.extentiatvs.pageobjects.HomePage;
import com.extentiatvs.utilities.WebElementUIHelperUtil;

public class HomePageActions 
{
	
	HomePage homePage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public HomePageActions(WebDriver driver)
	{
		homePage = new HomePage(driver);
		webElementUIHelperUtil = new WebElementUIHelperUtil(driver);
	}
	
	public void clickShopButton()
	{
		webElementUIHelperUtil.implicitWaitAndClick(homePage.getShopButton());
		
	}
	
	

}
