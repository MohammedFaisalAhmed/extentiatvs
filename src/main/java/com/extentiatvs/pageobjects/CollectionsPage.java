package com.extentiatvs.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionsPage 
{

	public WebDriver driver;
	
	@FindBy(xpath="//summary[@class='main-nav__item--toggle relative js-nav-hover js-toggle']/a[@data-name='Merchandise']")
	WebElement merchandiseButton;
	
	public CollectionsPage(WebDriver driver)
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

	public WebElement getMerchandiseButton() {
		return merchandiseButton;
	}

	public void setMerchandiseButton(WebElement merchandiseButton) {
		this.merchandiseButton = merchandiseButton;
	}
}
