package com.quickr.test;

import org.testng.annotations.Test;

import com.quickr.pom.BHP_SearchBox;
import com.quickr.pom.BikesHomePage;

import generics.Excel;

public class SearchBox extends BaseTest 
{
	
	@Test
	public void searchBox() throws InterruptedException
	{
		String searchText=Excel.getCellvalue(XLPATH, "searchtxt", 1, 0);
		String searchTitle=Excel.getCellvalue(XLPATH, "searchtxt", 1, 1);
		

		BikesHomePage b=new BikesHomePage(driver);

		b.clickBikes(); // click on bikes link in quikr.com.
		b.clickCity(); //  click on the city link of the hidden division popup.
	
	    Thread.sleep(3000);
		BHP_SearchBox Bs=new BHP_SearchBox(driver);
		Bs.searchBox(searchText); // type inside the search box.
        Bs.clickSearchButton();  //  click the search button.
        Bs.verifyTittle(searchTitle); // match the title searched page.
        Thread.sleep(3000);
		Bs.previousPage();// navigate to previous page
		Bs.clickBudgetButton();// clickBudgetButton
		Bs.selectPrice_1();//
        Bs.selectPrice_2();//
     	Bs.clickSearchButton();
	}

}
