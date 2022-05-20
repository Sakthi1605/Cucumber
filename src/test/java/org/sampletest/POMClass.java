package org.sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	
	
         public POMClass() {
        	 WebDriver driver= null;
        	 PageFactory.initElements(driver, this);
        	 
 		}
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	
	
	@FindBy(id="login")
	private WebElement login;



	public WebElement getTxtusername() {
		return txtusername;
	}



	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}



	public WebElement getTxtpassword() {
		return txtpassword;
	}



	public void setTxtpassword(WebElement txtpassword) {
		this.txtpassword = txtpassword;
	}



	public WebElement getLogin() {
		return login;
	}



	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
