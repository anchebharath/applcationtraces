package com.samplapp.konakartpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samplapp.actiondriver.Action;
import com.samplapp.base.Baseclass;

public class LoginPage extends Baseclass{
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	WebElement myaccountlink;
	
	@FindBy(xpath="//input[@id='loginUsername']")
	WebElement usernametxt;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordtxt;
	
	@FindBy(xpath="//a[@id='continue-button']")
	WebElement signinbtt;
	
	public LoginPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public HomePage loginTest(String uname, String pswd) {
		
		Action.implicitWait(getDriver(), 30);
		Action.click(getDriver(), myaccountlink);
		Action.type(usernametxt, uname);
		Action.type(passwordtxt, pswd);
		Action.click(getDriver(), signinbtt);
		return new HomePage();
		
	}

}
