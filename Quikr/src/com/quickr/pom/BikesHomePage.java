 package com.quickr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikesHomePage extends BasePage {
	@FindBy(xpath="//label[.='Bikes']")
	private WebElement Bikes;
	
	@FindBy(xpath="//ul[@class='popular-cities col-xs-6 col-sm-3']//a[.='Bangalore']")
	private WebElement Bangalore;
	
	@FindBy(xpath="//span[@class='hidden-xs']//i[@id='icon-arrows_down']")
	private WebElement arrow_down;
	

	
	public BikesHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickBikes()
	{
		
		Bikes.click();
	}
	

	
	public void clickCity()
	{
		verifyElementDisplayed(Bangalore);
		Bangalore.click();
	}
	
	public void clickArrow_Down()
	{
		verifyElementDisplayed(arrow_down);
		arrow_down.click();
	}

}
