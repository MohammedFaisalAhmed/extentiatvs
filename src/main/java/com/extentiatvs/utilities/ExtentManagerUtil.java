package com.extentiatvs.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManagerUtil 
{
	static ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	static ExtentReports extentReports;
	
	public static ExtentReports getextentReport()
	{
		if(extentReports==null)
		{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			String timeStamp =simpleDateFormat.format(new Date());
			ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("test-output/"+timeStamp+".html");
			extentSparkReporter.config().setDocumentTitle("TVS Automation Report");
			extentSparkReporter.config().setReportName("Test-Execution Report");
			extentReports = new ExtentReports();
			extentReports.attachReporter(extentSparkReporter);
			
		}
		return extentReports;

	}
	
	public static ExtentTest getTest()
	{
		
		return extentTest.get();
	}
	
	public static synchronized void createTest(String testName)
	{
		
		ExtentTest test = getextentReport().createTest(testName);
		extentTest.set(test);
	}
	
	public static void flushReport()
	{
		if(extentReports!=null)
		{
			extentReports.flush();
		}
		
		
	}

}





