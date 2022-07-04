package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers {

	
	public AudioPostPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div[class='mejs-button mejs-playpause-button mejs-play']") public WebElement playButton; 
	@FindBy(css= "span[class = 'mejs-time-current']") public WebElement sliderMusic; 
	@FindBy(css= "div[class = 'mejs-horizontal-volume-total']") public WebElement sliderVolume; 
	

	
}
