package com.Hydro.testcases;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.Hydro.utilities.Base;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Test2 extends Base{
	
	@Test(priority=2, timeOut=4000)
	public void testMethod2() throws InterruptedException
	{
		System.out.println("method2 execution started");
		test=extent.createTest("testmethod2");
		test.log(Status.INFO, "testmethod2 exection started");
		test.log(Status.FAIL, MarkupHelper.createLabel("testMethod3"+"-test fail", ExtentColor.RED));
		//test.log(Status.FAIL, Throwable());
		test.addScreenCaptureFromPath(null, null);
		Thread.sleep(5000);
	}

}
