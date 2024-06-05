package com.exponent.webapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLocator {

	
	
	By username=By.xpath("//input[@name=\"username\"]");
	By pass=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By login=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	public void OrangeHRMLogin(WebDriver driver,String userName,String password)
	{
		
		driver.findElement(username).sendKeys(userName);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(login).click();
	}

}
