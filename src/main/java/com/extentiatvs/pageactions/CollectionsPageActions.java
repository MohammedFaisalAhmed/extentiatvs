package com.extentiatvs.pageactions;

import org.openqa.selenium.WebDriver;

import com.extentiatvs.pageobjects.CollectionsPage;
import com.extentiatvs.utilities.WebElementUIHelperUtil;

public class CollectionsPageActions 
{
	CollectionsPage collectionsPage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public CollectionsPageActions(WebDriver driver)
	{
		collectionsPage= new CollectionsPage(driver);
		webElementUIHelperUtil= new WebElementUIHelperUtil(driver);
		
	}
	public void newWindowOpened()
	{
		webElementUIHelperUtil.switchToNewWindow();
		
	}
	public void clickMerchandiseButton()
	{
		
		webElementUIHelperUtil.implicitWaitAndClick(collectionsPage.getMerchandiseButton());
		
	}

}
