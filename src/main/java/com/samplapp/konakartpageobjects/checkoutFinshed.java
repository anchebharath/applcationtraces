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
public class checkoutFinshed extends Baseclass {
	
	@FindBy(xpath="//*[@id='page-title']")
	WebElement checkoutSuccefull;
	
	
public checkoutFinshed() {
		
		PageFactory.initElements(getDriver(), this);
		
	}

	/*
	 * public boolean checkOutMessage() {
	 * 
	 * return Action.isDisplayed(driver, checkoutSuccefull);
	 * 
	 * 
	 * }
	 */

public  logoutPage checoutSuccessfullTest() {
	Action.implicitWait(getDriver(), 20);
	Action.isDisplayed(getDriver(), checkoutSuccefull);
	Action.implicitWait(getDriver(), 20);
	return new logoutPage();
	
	
}
	
	

}
