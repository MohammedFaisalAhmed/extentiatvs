package com.extentiatvs.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class CollectionsPageSteps extends BaseSteps
{
	
	WebDriver driver;
	
	@Then("New window will be opened")
	public void new_window_will_be_opened() 
	{
	    collectionsPageActions.newWindowOpened();
	}
	@Then("User click on Merchandise button")
	public void user_click_on_merchandise_button() 
	{
	    collectionsPageActions.clickMerchandiseButton();
	}
	
	
	
	
}
