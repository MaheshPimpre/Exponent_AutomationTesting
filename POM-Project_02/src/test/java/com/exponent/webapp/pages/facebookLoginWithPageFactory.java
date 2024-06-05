package com.exponent.webapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class facebookLoginWithPageFactory {

	public WebDriver driver;
	
	public facebookLoginWithPageFactory(WebDriver driver)
	{
		this.driver=driver;
		
	}
	@CacheLookup
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")
	WebElement un;
	
	@CacheLookup
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")
	WebElement ps;
	
	@CacheLookup
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")
	WebElement login;
	
	public void openWebPage(String url)
	{
		driver.get(url);
	}
	
	public void facebookLogin(String user,String pass)
	{
		un.sendKeys(user);
		ps.sendKeys(pass);
		login.click();	
	}
}
