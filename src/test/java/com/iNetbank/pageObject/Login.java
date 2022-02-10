package com.iNetbank.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver ldriver;

	public Login(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void setpassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	public void clickbutton() {
		btnLogin.click();
	}
	
	
	
	
	
	
}
