package com.exponent.webapp.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.exponent.webapp.pages.OrangeHRMLocator;
import com.exponent.webapp.utility.Util;

public class OrangeHRMTest {

	@Test
	public void login()
	{
		try {
			Util.getWebDriver();
			Util.readProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OrangeHRMLocator orange=new OrangeHRMLocator();
		Util.driver.get(Util.url);
		orange.OrangeHRMLogin(Util.driver, Util.userName, Util.password);
		
		String text = Util.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
		System.out.println(text);
		
		
	}
}
