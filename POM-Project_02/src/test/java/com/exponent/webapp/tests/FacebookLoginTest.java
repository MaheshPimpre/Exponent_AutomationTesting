package com.exponent.webapp.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.exponent.webapp.pages.facebookLoginWithPageFactory;
import com.exponent.webapp.utility.Util;

public class FacebookLoginTest {

	@Test
	public void loginTest() throws IOException {
		Util.readProperties();
		Util.getWebDriver();
		facebookLoginWithPageFactory loginWithPageFactory = PageFactory.initElements(Util.driver,
				facebookLoginWithPageFactory.class);
		loginWithPageFactory.openWebPage(Util.facebookLoginUrl);
		loginWithPageFactory.facebookLogin(Util.userName, Util.password);
		String text = Util.driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Login Success");
	}
}
