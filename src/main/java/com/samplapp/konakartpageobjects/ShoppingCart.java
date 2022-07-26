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
public class ShoppingCart extends Baseclass{
	
	@FindBy(xpath="//*[@id='page-title']")
	WebElement shoppingCartPageTitle;
	
	//*[@id="continue-button"]/span
	
	@FindBy(xpath="//*[@id='continue-button']")
	WebElement checkoutbtn;
	
public ShoppingCart() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
public boolean validateorderconfirm() {
	return Action.isDisplayed(getDriver(), shoppingCartPageTitle);
	
	
	
}
	public OrderConfirm checkoutTest() {
		
		Action.click(getDriver(), checkoutbtn);
		return new OrderConfirm();
	}

}
