package org.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelEdge {
	
	
	WebDriver driver;
	
	@BeforeClass
	private void BeforeClass() {
          WebDriverManager.edgedriver().setup();
          driver=new EdgeDriver();
          driver.get("https://www.facebook.com/login/");
          driver.manage().window().maximize();
	}
	
	@Test
	private void tco01() {
		  WebElement txtusername = driver.findElement(By.id("email"));
		     txtusername.sendKeys("sakthi@123");

	}
	
	
	
	
	
	
	
	
	
	

}
