package com.extentiatvs.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.extentiatvs.utilities.ConfigUtil;
import com.extentiatvs.utilities.DriverFactoryUtil;
import com.extentiatvs.utilities.ExtentManagerUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	public WebDriver driver;
	
	@Before
	public void setUp(Scenario scenario)
	{
		String requiredBrowser =ConfigUtil.getBrowser();
		this.driver=DriverFactoryUtil.getDriver(requiredBrowser);
		
		String requiredUrl =ConfigUtil.getProperty("baseUrl");
		driver.get(requiredUrl);
		
		ExtentManagerUtil.createTest(scenario.getName());
		ExtentManagerUtil.getTest().log(Status.INFO, "TestCase-Started"+scenario.getName());
		
				
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/pneg", "Failed-Screenshot");
			ExtentManagerUtil.getTest().log(Status.FAIL, "TestCase-Failed"+scenario.getName());
			ExtentManagerUtil.getTest().addScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64));
				
		}
		else
		{
			ExtentManagerUtil.getTest().log(Status.PASS, "Test-case Pass"+scenario.getName());
		}
		
		DriverFactoryUtil.closeDriver();
		ExtentManagerUtil.flushReport();
		
	}

}
