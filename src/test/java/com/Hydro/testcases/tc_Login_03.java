package com.Hydro.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Hydro.PageObjects.LoginPage12;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class tc_Login_03 extends BaseTest12{
	@Test
	public void loginTest() throws IOException
	{
		test=extent.createTest("login test");
		test.log(Status.INFO, "page test execution started");
		log.info("Enter the url");
		//driver.get(url);
		driver.manage().window().maximize();
		
		//String tile=driver.getTitle();
		//System.out.println(tile);
//		Assert.assertTrue(true);
//		System.out.println("Home page is displayed");
		LoginPage12 lp=new LoginPage12(driver);
		log.info("Enter the username");
		lp.setusername(username);
		log.info("Enter the password");
		lp.setpassword(password);
		log.info("Click on login button");
		lp.setloginButton();
         //test.log(Status.INFO, "page test execution started");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			test.log(Status.PASS, MarkupHelper.createLabel("pagetest"+"-test pass", ExtentColor.GREEN));
		}
		else
		{
			Assert.assertFalse(false);
			System.out.println("test fails");
			takeScreenshot("logintest");
			String scpath=System.getProperty("user.dir")+"/Screenshots/"+"pagetest.png";
			test.log(Status.FAIL, MarkupHelper.createLabel("xldata"+"-test fail", ExtentColor.RED));
			//test.addScreenCaptureFromPath(scpath, "Guru Page");
			test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath(scpath, "Guru page").build());
			
		
	}

}}
