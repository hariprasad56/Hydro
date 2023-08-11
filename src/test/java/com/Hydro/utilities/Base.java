package com.Hydro.utilities;

import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class Base {
	public static ExtentReports extent; 
	public static ExtentTest test;
	@BeforeSuite
	public void setUp1()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY,HH-mm-ss");
		Date date=new Date();
		String dateformat=sdf.format(date);
		String repName="report"+dateformat+".html";
		ExtentSparkReporter spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+repName);
		spark.config().setDocumentTitle("Hydro");
		spark.config().setReportName("Automation Test Report");
		spark.config().setTimeStampFormat("dd-MM-YYYY,HH-mm-ss");
		spark.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports(); 
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name" ,"Local Host" );
		extent.setSystemInfo("Environment" ,"QA" );
		extent.setSystemInfo("User" ,"Hari" );
		
		
	}
	@AfterSuite
	public void teatDown()
	{
		extent.flush();
	}

}
