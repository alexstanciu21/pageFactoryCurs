package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class BookElementsPage extends SeleniumWrappers {
	
	public BookElementsPage(WebDriver driver) {
		super(driver); 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[class='woocommerce-product-gallery__trigger']") public WebElement searchElement; 
	@FindBy(css="div[class='woocommerce-product-details__short-description']") public WebElement descriptionElement; 
	@FindBy(css="button[name='add-to-cart']") public WebElement addToCartElement; 
	@FindBy(css="div[class='quantity']") public WebElement quantityElement; 
	@FindBy(css="h1[class*='product_title']") public WebElement titleElement; 
	@FindBy(css="div[class='product_meta']") public WebElement productMetaElement; 
	
	
	

}