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
public class CheckoutConfirmation extends Baseclass{
	@FindBy(xpath="//*[@id='page-title']")
	WebElement checkouttitle;
	
	//*[@id='continue-button']
	
	@FindBy(xpath="//*[@id='continue-button']")
	WebElement checkoutcontinuebtn;
	
	
public CheckoutConfirmation() {
		
		PageFactory.initElements(getDriver(), this);
		
	}

public boolean checkoutPageNavigation() {
	return Action.isDisplayed(getDriver(), checkouttitle);
	
}
	
	
public checkoutFinshed checkoutTest() {
	Action.click(getDriver(), checkoutcontinuebtn);
	return new checkoutFinshed();
}
	

}
