package com.extentiatvs.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class ShopPageSteps extends BaseSteps
{
	
	WebDriver driver;
	
	@When("User selects any {string} from  Accessories and Merchandise section.")
	public void user_selects_any_from_accessories_and_merchandise_section(String productName)
	{
	    shopPageActions.selectAnyProductFromAccessoriesAndMerchandise(productName);
	}
	
	
	
	
	

}
