package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainApplication {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.google.com/");
		
		//Click accept all
		driver.findElement(By.id("L2AGLb")).click();
		
		//Enter text in search box 
		driver.findElement(By.cssSelector("input.gLFyf[maxlength=\"2048\"]")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input.gLFyf[maxlength=\"2048\"]")).click();
		
        //Maximize the browser  
        driver.manage().window().maximize();  
	}
}
