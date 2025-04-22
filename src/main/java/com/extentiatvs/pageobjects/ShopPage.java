package com.extentiatvs.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.extentiatvs.utilities.WaitUtil;

public class ShopPage 
{
	public WebDriver driver;
	WebDriverWait wait;
	
	public ShopPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	public WebElement getAccessoriesAndMerchandiseProduct(String productName)
	{
		By accessoriesAndMerchandiseProductLocator=By.xpath("//div[@class='product-wrap-lg']//span[text()='"+productName+"']");
		return wait.until(ExpectedConditions.presenceOfElementLocated(accessoriesAndMerchandiseProductLocator));
		
		
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
	
	
	

}
