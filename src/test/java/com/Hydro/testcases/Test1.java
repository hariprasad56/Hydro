package com.Hydro.testcases;

import org.testng.annotations.Test;

import com.Hydro.utilities.Base;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
@Test(priority=1, timeOut=3000)
public class Test1 extends Base{
	public void testMethod1() throws InterruptedException
	{
		System.out.println("method1 execution started");
		test=extent.createTest("testMethod1");
		test.log(Status.INFO, "testmethod1 execution started");
		test.log(Status.PASS, MarkupHelper.createLabel("testMethod1"+"-test pass", ExtentColor.GREEN));
		Thread.sleep(4000);
	}
	
	
}
