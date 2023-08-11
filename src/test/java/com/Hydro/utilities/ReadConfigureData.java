package com.Hydro.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigureData {
	Properties pro;
	public ReadConfigureData()
	{
		try
		{
			File fl= new File("./Configuration/configure.properties");
			FileInputStream fi=new FileInputStream(fl);
			pro=new Properties();
			pro.load(fi);
		}
		catch(Exception e)
		{
			System.out.println("exception hanled");
		}
		
	}
	public String getbaseurl()
	{
		String burl=pro.getProperty("baseurl");
		return burl;
	}
	public String getusername()
	{
		String usr=pro.getProperty("username");
		return usr;
	}
	public String getpassword()
	{
		String psw=pro.getProperty("password");
		return psw;
	}
	public String getchromepath()
	{
		String cpth=pro.getProperty("chromepath");
		return cpth;
	}
	public String getfirefoxpath()
	{
		String fpth=pro.getProperty("firefoxpath");
		return fpth;
	}

}
