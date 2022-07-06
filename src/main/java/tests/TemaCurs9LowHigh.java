package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs9LowHigh extends BaseTest{
	
	@Test
	public void sortLowHigh() throws InterruptedException{
		
		app.navMenu.navigateTo(app.navMenu.shoplink);
		Thread.sleep(3000);
		
		app.shopPage.filterByValue("price");
		Thread.sleep(9000);
				
		double firstItem =  Double.parseDouble(app.shopPage.firstItem.getText().substring(1)); 
		double lastItem =  Double.parseDouble(app.shopPage.lastItem.getText().substring(1)); 
		
		assertTrue(firstItem < lastItem);
		
	}

}
