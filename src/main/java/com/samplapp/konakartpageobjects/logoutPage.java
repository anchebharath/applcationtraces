/**
 * 
 */
package com.samplapp.konakartpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samplapp.actiondriver.Action;
import com.samplapp.base.Baseclass;

/**
 * @author banche
 *
 */
public class logoutPage extends Baseclass{
	
	@FindBy(xpath="//*[@id='options']/div[1]/span[2]/a")
	WebElement logoutbtn;
	
	
	@FindBy(xpath="//*[@id='page-title']")
	WebElement logofftitle;
	
	
	@FindBy(xpath="//*[@id='continue-button']/span")
	WebElement continuebtn;
	
public logoutPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}

	/*
	 * public boolean logoutTitle() {
	 * 
	 * return Action.isDisplayed(driver, logofftitle); }
	 */
public WelcomePage logoutTest() {
	
	Action.click(getDriver(), logoutbtn);
	Action.implicitWait(getDriver(), 20);
	Action.isDisplayed(getDriver(), logofftitle);
	Action.implicitWait(getDriver(), 10);
	Action.click(getDriver(), logoutbtn);
	return new WelcomePage();
}

}
