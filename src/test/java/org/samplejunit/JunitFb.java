package org.samplejunit;



import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitFb {
	
	 static WebDriver driver;
	
	@BeforeClass
	 public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
	}
	

	@Parameters("txtusername")
	@Test
	
	public void tco1(String s) {
       
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("s");
	
	}
	@Parameters("txtpassword")
	@Test
	
	public void tc02(String s1) {
		 WebElement e = driver.findElement(By.id("email"));
             e.sendKeys("s1");
	}
	
	
	@Test
	
	public void tco3() {
		
		
		WebElement fe = driver.findElement(By.className("_6ltg"));
		fe.click();
		
		

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
