package org.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DP {
	
	public 	WebDriver driver;
	
	@BeforeMethod
	private void beforeclass() {
     WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	
	
	@Test(dataProvider="getData")
	private void tc0(String s,String s2) {
		     WebElement txtusername = driver.findElement(By.id("email"));
		     txtusername.sendKeys(s);
		     
		     WebElement txtpassword = driver.findElement(By.id("pass"));
		      txtpassword.sendKeys(s2);
		
		

	}
	
	
	@DataProvider(name="getData")
	private Object[][] getData(){
	
	
	Object[][] data = new Object[3][2];
	
	
	data[0][0] ="sakthi@123";
	data[0][1] ="test@432";
	data[1][0] ="sakthi@987";
	data[1][1] ="test@543";
	data[2][0] ="sakthi@5678";
	data[2][1] ="test@34567";
	
	
	
	
	
	
	
	
	
	return data;
	
	
	
	
	
	
	
	
	
	
	}

	}
