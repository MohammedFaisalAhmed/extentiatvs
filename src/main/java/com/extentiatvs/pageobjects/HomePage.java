package com.extentiatvs.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	
	public WebDriver driver;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav megaMenu']//a[text()='Shop']")
	private WebElement shopButton;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getShopButton() {
		return shopButton;
	}

	public void setShopButton(WebElement shopButton) {
		this.shopButton = shopButton;
	}

}
