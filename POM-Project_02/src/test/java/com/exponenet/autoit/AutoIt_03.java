package com.exponenet.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt_03 {

	
	public void gitTest()
	{
		System.out.println("Welcome in Git");
	}

	
	public void m1()
	{
		System.out.println("m1--method");
	}

	static{
		System.out.println("Static block add");
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Auto-Se-Test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/split_pdf");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span"))
		.click();

		try {
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Auto-Se-Test\\pdfToWord.exe");
			Thread.sleep(3000);
			System.out.println("hi----------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
