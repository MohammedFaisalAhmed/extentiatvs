package com.extentiatvs.utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WebElementUIHelperUtil 
{
	public  WebDriver driver;
	WaitUtil waitUtil;
	String mainWindow;
	
	public WebElementUIHelperUtil(WebDriver driver)
	{
		
		this.driver=driver;
		waitUtil= new WaitUtil(driver);
		mainWindow=driver.getWindowHandle();
	}

	public void implicitWaitAndClick(WebElement element)
	{
		waitUtil.implicitWait(driver, 30);
		element.click();
		
	}
	
	public void explicitWaitClick(WebElement element)
	{
		
		waitUtil.explicitWait(driver, 30, ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void ScrollImplicitWaitAndClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		implicitWaitAndClick(element);
	}
	public void ScrollExplicitWaitAndClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		explicitWaitClick(element);
	}
	
	public void switchToNewWindow()
	{
		   Set<String> windowHandles = driver.getWindowHandles();
		   for(String window:windowHandles)
		   {
			   if(!window.equals(mainWindow))
		   {
			   driver.switchTo().window(window);
			   break;
			   
		   }
		   }
	}
		
		   public void switchBackToMainWindow()
		   {
			   driver.switchTo().window(mainWindow);
			   
		   }
		
	
		
	}
	

	

