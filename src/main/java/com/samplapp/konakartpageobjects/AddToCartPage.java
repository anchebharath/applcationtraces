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
public class AddToCartPage extends Baseclass {
	
	
	
	
	@FindBy(xpath="//*[@id='shopping-cart']")
	WebElement shoppintkartlnk;
	
public AddToCartPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}

public ShoppingCart shoppingCartTest() {
	Action.click(getDriver(), shoppintkartlnk);
	return new ShoppingCart();


}
}