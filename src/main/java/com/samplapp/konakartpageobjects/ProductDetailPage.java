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
public class ProductDetailPage extends Baseclass {
	@FindBy(xpath="//span/a[contains(text(),'Home')]")
	WebElement Homelink;
	@FindBy(xpath="//h2[text()='New Arrivals']")
	WebElement newarrivalstext;	
	
	@FindBy(xpath="//*[@id='search-input']")
	WebElement searchtxt;
	@FindBy(xpath="//*[@id='search-button']")
	WebElement searchbtn;
	@FindBy(xpath="//*[@id='item-overview']/div[2]/ul/li/div/a")
	WebElement productone;
	
	@FindBy(xpath="//*[@id='AddToCartForm']/div[6]/a")
	WebElement addtocartbtn;
	
	
	
	
public ProductDetailPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}

public AddToCartPage addToCartTest() {
	Action.click(getDriver(), Homelink);
	Action.implicitWait(getDriver(), 20);
	Action.type(searchtxt, "Call Of Duty");
	Action.implicitWait(getDriver(), 20);
	Action.click(getDriver(), searchbtn);
	Action.click(getDriver(), productone);
	Action.click(getDriver(), addtocartbtn);
	return new AddToCartPage();
}

}
