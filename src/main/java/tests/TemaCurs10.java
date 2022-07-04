package tests;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs10 extends BaseTest{
	
	@Test
	public void audioPostActions() throws InterruptedException {
		
		Actions action = new Actions(driver); 

		app.loginPage.hoverElement(app.loginPage.loginPopUp);
		
		app.navMenu.hoverElement(app.navMenu.blogLink);
		
		app.navMenu.navigateTo(app.navMenu.postFormatsLink);
		assertTrue(app.navMenu.checkCurrentUrl("https://keybooks.ro/category/post-formats/"));
		
		app.formatsPage.click(app.formatsPage.audioPostLink);
		
		app.audioPostPage.click(app.audioPostPage.playButton);
	
		action.dragAndDropBy(app.audioPostPage.sliderMusic, 200, 0).perform(); 
		Thread.sleep(5000);
		
		action.dragAndDropBy(app.audioPostPage.sliderVolume, 50, 0).perform(); 
		Thread.sleep(5000);
	
	}
	

}
