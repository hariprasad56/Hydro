package com.Hydro.testcases;

import org.testng.annotations.Test;

import com.Hydro.utilities.Base;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Test3 extends Base{
	@Test(priority=0)
	public void testMethod3()
	{
		System.out.println("method3 execution started");
		test=extent.createTest("testMethod3");
		test.log(Status.INFO, "testmethod3 exection started");
		test.log(Status.SKIP, MarkupHelper.createLabel("testMethod3"+"-test skipped", ExtentColor.ORANGE));
	}

}
