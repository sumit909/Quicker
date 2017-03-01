package com.quickr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BHP_SearchBox extends BasePage {
	
	@FindBy(id="search-query-field")
	private WebElement searchBox;
	
	@FindBy(id="auto-suggest-submit")
	private WebElement searchButton;
	

	
	@FindBy(xpath="//i[@class='icon-arrows_down auto-suggest-budget ddm-icon']")
	private WebElement budgetButton;
	
	@FindBy(xpath="//ul[@id='js-desktopMinBudgetLiHtml']/li[@data-val='10000']")
	private WebElement price_1;
	
	@FindBy(xpath="//ul[@id='js-desktopMinBudgetLiHtml']//li[@data-val='20000'] ")
	private WebElement price_2;
	
	@FindBy(xpath="//a[@id='auto-suggest-budget']/i[@class='icon-arrows_down auto-suggest-budget ddm-icon']")
	private WebElement crossButton;
	
	public BHP_SearchBox(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void searchBox(String searchText)
	{
		searchBox.sendKeys(searchText);
	}
		
	public void previousPage()
	{
		driver.navigate().back();
	}

	public void clickBudgetButton()
	{
		verifyElementDisplayed(budgetButton);
		budgetButton.click();
	}
	
	public void selectPrice_1()
	{
		
		price_1.click();
	}
	
public void selectPrice_2()
{
	verifyElementDisplayed(price_2);
	price_2.click();
}

public void clickSearchButton()
{
	searchButton.click();
}
}
