package com.extentiatvs.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseSteps
{
	WebDriver driver;
	
	@Given("User click on Shop button.")
	public void user_click_on_shop_button()
	{
	    homePageActions.clickShopButton();
	}
	
	

}
