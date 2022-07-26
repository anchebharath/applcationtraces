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
public class WelcomePage extends Baseclass{
	
	@FindBy(xpath="//h2[text()='New Arrivals']")
	WebElement konakartlogo;
	
public WelcomePage() {
		
		PageFactory.initElements(getDriver(), this);
		
		
	}
public String  welcomePageTest() {
	
	Action.implicitWait(getDriver(), 20);
	String logo = getDriver().getCurrentUrl();
	return logo;
	
}


}
