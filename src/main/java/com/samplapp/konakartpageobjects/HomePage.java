package com.samplapp.konakartpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samplapp.actiondriver.Action;
import com.samplapp.base.Baseclass;

public class HomePage extends Baseclass{
	
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
	
	
	@FindBy(xpath="//span/a[text()='Games']")
	WebElement gamelink;
	
	@FindBy(xpath="//*[@id='item-overview']/div[2]/ul/li/div/a")
	WebElement producttwo;
	
	@FindBy(xpath="//*[@id='item-overview']/div[2]/ul/li/div/a")
	WebElement productthree;
	
	@FindBy(xpath="//*[@id='item-overview']/div[2]/ul/li/div/a")
	WebElement productfour;
	
public HomePage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public boolean verifyArrivalText() {
		
		return Action.isDisplayed(getDriver(), newarrivalstext);
		
		
	}
	
	public String getUrl() {
		String homepageurl = getDriver().getCurrentUrl();
		return homepageurl;
	}

	
	public ProductDetailPage homeTest() {
		
		Action.click(getDriver(), Homelink);
		Action.implicitWait(getDriver(), 20);
		Action.type(searchtxt, "Call Of Duty");
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), searchbtn);
		Action.click(getDriver(), productone);
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), gamelink);
		Action.implicitWait(getDriver(), 20);
		Action.type(searchtxt, "Disciples: Sacred Lands");
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), searchbtn);
		Action.click(getDriver(), producttwo);
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), gamelink);
		Action.implicitWait(getDriver(), 20);
		Action.type(searchtxt, "The Wheel Of Time");
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), searchbtn);
		Action.click(getDriver(), productthree);
		//Action.implicitWait(driver, 20);
		//Action.click(driver, productthree);
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), gamelink);
		Action.implicitWait(getDriver(), 20);
		Action.type(searchtxt, "Unreal Tournament");
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), searchbtn);
		Action.click(getDriver(), productfour);
		Action.implicitWait(getDriver(), 20);
		Action.click(getDriver(), Homelink);
		return new ProductDetailPage();
	}

}
