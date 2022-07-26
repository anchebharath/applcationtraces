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
public class OrderConfirm extends Baseclass {
	
	@FindBy(xpath="//*[@id='page-title']")
	WebElement orderconfirmationtext;
	
	//*[@id="continue-button"]
	
	@FindBy(xpath="//*[@id='continue-button']")
	WebElement confirmorderbtn;
	
	
public OrderConfirm() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
public boolean orderConpagenavigation() {
	
	return Action.isDisplayed(getDriver(), orderconfirmationtext);
}

public CheckoutConfirmation orderConfirmationTest() {
	
	Action.isDisplayed(getDriver(), orderconfirmationtext);
	Action.click(getDriver(), confirmorderbtn);
	return new CheckoutConfirmation();
}



}
