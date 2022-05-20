package org.sampletest;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends FunLib {
	

	FunLib lib;
    POMClass log;
	
	 
	
	
	@BeforeClass
	 public static void beforeclass() {
	FunLib	lib = new FunLib();
	lib.getdriver("chrome");
	lib.getUrl("https://www.facebook.com/login/");
	}
	

	@Parameters("username")
	@Test
	
	public void tco1(String s) {
   
		log        =     new POMClass();
		WebElement txtusername = log.getTxtusername();
	    lib.typetext1(txtusername, s);
	}
	@Parameters("password")
	@Test
	
	public void tc02(String s1) {
		 log = new POMClass();
		 WebElement txtpassword = log.getTxtpassword();
		 lib.typetext1(txtpassword, s1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
