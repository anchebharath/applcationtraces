package com.samplapp.konakartpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUser {
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	WebElement myaccountlink;
	
	@FindBy(xpath="//span[contains(text(),'Register an account')]")
	WebElement registerbttn;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement genderbttn;

	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstnametxt;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastnametxt;
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement datepickertxt;
	
	@FindBy(xpath="//input[@id='emailAddr']")
	WebElement emailtxt;
	
	@FindBy(xpath="//input[@id='streetAddress']")
	WebElement streetaddtxt;

	@FindBy(xpath="//input[@id='postcode']")
	WebElement postnumtxt;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement citytxt;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement statetxt;
	
	@FindBy(xpath="//input[@id='telephoneNumber']")
	WebElement phonenumtxt;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwdtxt;
	
	@FindBy(xpath="//input[@id='passwordConfirmation']")
	WebElement pwdconfirmtxt;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement continuebtn;
	
	
}
