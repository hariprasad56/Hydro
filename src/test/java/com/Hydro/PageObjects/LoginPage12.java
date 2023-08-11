package com.Hydro.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage12 {
	WebDriver d;
	public LoginPage12(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="uid")WebElement usname;
	
	@FindBy(name="password")WebElement pasword;
	
	@FindBy(name="btnLogin")WebElement logbutton;
	
	@FindBy(xpath="//a[text()='Log out']")WebElement logout;
	
	public void setusername(String uname)
	{
		usname.sendKeys(uname);
	}
	public void setpassword(String password)
	{
		pasword.sendKeys(password);
	}
	public void setloginButton()
	{
		logbutton.click();
	}
	public void setlogout()
	{
		logout.click();
	}


}
