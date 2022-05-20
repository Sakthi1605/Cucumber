package org.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelChrome {
	
	
WebDriver driver;
	
	@BeforeClass
	private void BeforeClass() {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("https://www.facebook.com/login/");
          driver.manage().window().maximize();
	}
	
	@Test
	private void tco01() {
		  WebElement txtusername = driver.findElement(By.id("email"));
		     txtusername.sendKeys("sakthi@123");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
