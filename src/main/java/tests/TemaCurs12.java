package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TemaCurs12 extends BaseTest{
	
	@Test
	public void submitComment() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String javaScriptHover = "var objObject = document.createEvent('MouseEvents');"
				+ "objObject.initMouseEvent('mouseover',true);" + "arguments[0].dispatchEvent(objObject);";

		WebElement blogHover = driver.findElement(By.id("menu-item-76"));
		jse.executeScript(javaScriptHover, blogHover);
		app.navMenu.navigateTo(app.navMenu.postFormatsLink);

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.cssSelector("article[class*='format-gallery']"));
		jse.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(5000);

		WebElement pageGaleryLink = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/2016/02/01/gallery-format/']"));
		jse.executeScript("arguments[0].click();", pageGaleryLink);

		WebElement commentSection = driver.findElement(By.cssSelector("h2[class*='comments_form_title']"));
		jse.executeScript("arguments[0].scrollIntoView()", commentSection);
		Thread.sleep(5000);

		jse.executeScript("document.getElementsByName('comment')[0].value='commentariu galerie nr2'");
		jse.executeScript("document.getElementsByName('author')[0].value='John Doe2'");
		jse.executeScript("document.getElementsByName('email')[0].value='JohnDoe@keybooks2.ro'");
		jse.executeScript("document.getElementsByName('url')[0].value='keygames2.ro'");
		jse.executeScript("document.getElementsByClassName('submit')[0].click()");

	}


}
