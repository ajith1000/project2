package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersOptional {
	@Parameters({"ail","pass"})
	@Test
	public void tc1(@Optional("xyz@gmail.com")String email,String pass) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace-Ajith\\SampleMevan\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement txtEmail = driver.findElement(By.id("email")); 
    txtEmail.sendKeys(email);		
    WebElement txtPass = driver.findElement(By.id("pass"));
    txtPass.sendKeys(pass);
    
    
    
    
    
	}

}
