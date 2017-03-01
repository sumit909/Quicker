package com.quickr.test;

import org.testng.annotations.Test;


import com.quickr.pom.BikesHomePage;

import generics.Excel;

public class NavigateToBikesHomePage extends BaseTest 
{
	@Test
	public void testNavigateToBikesPage() throws InterruptedException
	{   
		String bikeHomepageTittle=Excel.getCellvalue(XLPATH, "bikehomepage", 1, 0);
		String cityPageTitle=Excel.getCellvalue(XLPATH, "cityTitle", 1, 0);
		
		BikesHomePage b=new BikesHomePage(driver);

		b.clickBikes();  //click on bikes link in quikr.com
		
		b.verifyTittle(bikeHomepageTittle); //verify the title of bike home page of quikr.com
	
		b.clickCity(); // click on the city link of the hidden division popup
		
		b.verifyTittle(cityPageTitle); // verify the title of the changed location
		
		b.clickArrow_Down(); // click the select city menu
		
		

		
	}
	
}
