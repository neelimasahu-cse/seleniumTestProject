package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class VerifyGoogleSearch {
	
	WebDriver driver;
	
  @Test
  public void verifyGoogleSearch() {

		//Click accept all
		driver.findElement(By.id("L2AGLb")).click();
		
		//Enter text in search box 
		driver.findElement(By.cssSelector("input.gLFyf[maxlength=\"2048\"]")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input.gLFyf[maxlength=\"2048\"]")).click();
		
		//Find the Google Offered in Text
		String actualText = driver.findElement(By.cssSelector("div#SIvCob")).getText();
		String expectedText = "Google angeboten auf: English";
		Assert.assertEquals(actualText, expectedText);
		

  }
  
  @Test
  public void verifyGmailLinkDisplayed() {
	  boolean buttonDisplayed = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  Assert.assertTrue(buttonDisplayed);
  }
  
  @BeforeTest
  public void beforeTest() {
	  	//Open Chrome Browser
//		  ChromeOptions options = new ChromeOptions();
//		  options.addArguments("--headless");
//		driver=new ChromeDriver(options);  
	  	driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
		 
        //Maximize the browser  
        driver.manage().window().maximize();  
        
  }

  @AfterTest
  public void afterTest() {
	  //Close the browser
	  driver.close();
  }

}
