package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{
	
	public ShopPage(WebDriver driver) {
		super(driver); 
		PageFactory.initElements(driver, this);
	}
	
	public WebElement dropdown; 
	public Select selectDropdown; 
	
	@FindBy(css="span[style='left: 0%;']") public WebElement sliderInitialPosition; 
	@FindBy(css="span[style='left: 100%;']") public WebElement sliderFinalPosition; 
	@FindBy(css="select[name = 'orderby']") public WebElement orderDropDown; 
	@FindBy(css="li[class*='product-type-simple']:nth-child(1) span[class='price']") public WebElement firstItem; 
	@FindBy(css="li[class*='product-type-simple']:nth-child(12) span[class='price']") public WebElement lastItem; 
	@FindBy(linkText = "The forest") public WebElement theForest; 


	public void filterByValue(String value) {
		selectDropdown = new Select(orderDropDown); 
		selectDropdown.selectByValue(value); 	
	}
	
}
