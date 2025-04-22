package com.extentiatvs.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.extentiatvs.pageactions.CollectionsPageActions;
import com.extentiatvs.pageactions.HomePageActions;
import com.extentiatvs.pageactions.ShopPageActions;
import com.extentiatvs.utilities.ConfigUtil;
import com.extentiatvs.utilities.DriverFactoryUtil;

public class BaseSteps 
{
	public WebDriver driver;
	public HomePageActions homePageActions;
	public ShopPageActions shopPageActions;
	public CollectionsPageActions collectionsPageActions;

	public BaseSteps()
	{
		String browser =ConfigUtil.getBrowser();
		this .driver=DriverFactoryUtil.getDriver(browser);
		initializePages();

	}

	public void initializePages()
	{
		homePageActions = new HomePageActions(driver);
		shopPageActions = new ShopPageActions(driver);
		collectionsPageActions= new CollectionsPageActions(driver);

	}

}
