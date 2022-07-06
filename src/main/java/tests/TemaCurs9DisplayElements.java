package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs9DisplayElements extends BaseTest{	

	@Test
	public void bookElements() throws InterruptedException{
		
		app.navMenu.navigateTo(app.navMenu.shoplink);
		Thread.sleep(3000);
		
		app.shopPage.theForest.click();
		Thread.sleep(3000);
		
		assertTrue(app.bookElementsPage.searchElement.isDisplayed());
		assertTrue(app.bookElementsPage.addToCartElement.isDisplayed());
		assertTrue(app.bookElementsPage.descriptionElement.isDisplayed());
		assertTrue(app.bookElementsPage.productMetaElement.isDisplayed());
		assertTrue(app.bookElementsPage.quantityElement.isDisplayed());
		assertTrue(app.bookElementsPage.titleElement.isDisplayed());
		
	}

}
