package com.quickr.pom;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public abstract class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void verifyTittle(String expectedTittle)//1
	{
		WebDriverWait wait=new WebDriverWait(driver,20);

		try
		{
		wait.until(ExpectedConditions.titleIs(expectedTittle));
		Reporter.log("Tittle is same : Pass",true);
		}
		catch(TimeoutException e)
		{
		Reporter.log("Tittle is not same : Fail",true);
		Assert.fail();
		}
	}
	

public void verifyElementDisplayed(WebElement element)//2
{
	       WebDriverWait wait=new WebDriverWait(driver,20);
			 try
			 {
				 wait.until(ExpectedConditions.visibilityOf(element));
				 Reporter.log("Element is Displayed : Pass",true);
			 }
			 catch(TimeoutException e)
			 {
				 Reporter.log("Element is Not Displayed : Fail",true);
				 Assert.fail();
			 }                      
}

//public void waitForElement(WebElement element)//3
//  {
//	 WebDriverWait wait=new WebDriverWait(driver,20);
//	 try
//	 {
//		 wait.until(ExpectedConditions.elementToBeClickable(element));
//	 }
//	 catch(Exception e)
//	 {
//		 Reporter.log("Increase the time limit",true);
//		 Assert.fail();
//	 }
//  }
}

