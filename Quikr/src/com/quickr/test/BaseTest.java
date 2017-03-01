package com.quickr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty(KEY,VALUE);
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

}
