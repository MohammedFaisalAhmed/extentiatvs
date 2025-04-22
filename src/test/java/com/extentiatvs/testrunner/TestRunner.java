package com.extentiatvs.testrunner;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.core.cli.Main;

@CucumberOptions
(

		features="src/test/resources/features/shop.feature",
		glue={"com.extentiatvs.stepdefinitions"},
		tags="@UserShopsTVSAccesories&Merchandise",
		plugin= {"pretty","html:target/cucumber-reports.html"},
		monochrome=true

		)


public class TestRunner extends AbstractTestNGCucumberTests

{
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}






}
