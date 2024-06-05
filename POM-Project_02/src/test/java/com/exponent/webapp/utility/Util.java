package com.exponent.webapp.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {

	public static  WebDriver driver;
	public static String userName;
	public static String password;
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public static String facebookLoginUrl="https://www.facebook.com/login/web/";
	public static void readProperties() throws IOException
	{
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Mahesh\\eclipse-workspace\\POM-Project_02\\src\\test\\resources\\OrangeHRMResources\\loginData.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		
		userName=prop.getProperty("userName");
		password=prop.getProperty("password");
		System.out.println(userName);
		System.out.println(password);
	}
	
	public static void getWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Auto-Se-Test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	

}
