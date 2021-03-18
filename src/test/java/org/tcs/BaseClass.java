package org.tcs;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;

	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\Employee\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openBrowser(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void type(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void actions(WebElement w) {
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
	}

	public static void rightClick(WebElement w) {
		Actions a = new Actions(driver);
		a.contextClick(w).perform();
	}

	public static void doubleClick(WebElement w) {
		Actions a = new Actions(driver);
		a.doubleClick(w).perform();
	}

	public static void clickUsingActions(WebElement w) {
		Actions a = new Actions(driver);
		a.click(w).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, dest).perform();
	}

	public static void clickAndHold(WebElement w) {
		Actions a = new Actions(driver);
		a.clickAndHold(w).perform();
	}

	public static void release(WebElement w) {
		Actions a = new Actions(driver);
		a.release(w).perform();
	}

	public static void selectByIndex(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getAttribute(WebElement element, String value) {
		String text = element.getAttribute(value);
		System.out.println(text);
	}

	public static void screenshot(String location) {
		try {
			TakesScreenshot t = (TakesScreenshot) driver;
			File source = t.getScreenshotAs(OutputType.FILE);
			File dest = new File(location);
			FileUtils.copyFile(source, dest);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void scrollDown(WebElement element,String value) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView("+value+")", element);
	}

	

	public static void javaScriptType(WebElement element, String text) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','text')", element);
	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", element);
	}
	

	public static void closeWindow() {
		driver.close();
	}

	public static void quitWindow() {
		driver.quit();
	}

}
