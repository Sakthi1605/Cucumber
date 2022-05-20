package org.sampletest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunLib {
	
	
	static WebDriver driver;
	
	public void getdriver(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new  FirefoxDriver();
			break;
	
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
       default:
			System.out.println("Invalid Browser");
			break;
		}
		
		}
	public void getUrl(String url) {
	driver.get(url);
	}
	
	public void txtkeys(WebElement element,String text) {

		element.sendKeys(text);
	}
	
	public void btnclick(WebElement element) {
     element.click();
		
	}
	
	
	public WebElement locators(String locator,String value) {
		WebElement  findElement=null;
           switch (locator) {
		case "id":
			 findElement = driver.findElement(By.id(value));
			break;
		case "name":
			 findElement = driver.findElement(By.name(value));
			break;
		case "class":
			 findElement = driver.findElement(By.className(value));
			break;
		case "xpath":
			 findElement = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Invalid Locators");
			break;
		}
           return  findElement;
	}
	
	public void typetext1(WebElement element,String value) {
		 element.sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
