package com.konakartregistration.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.samplapp.base.Baseclass;
import com.samplapp.konakartpageobjects.AddToCartPage;
import com.samplapp.konakartpageobjects.CheckoutConfirmation;
import com.samplapp.konakartpageobjects.HomePage;
import com.samplapp.konakartpageobjects.LoginPage;
import com.samplapp.konakartpageobjects.OrderConfirm;
import com.samplapp.konakartpageobjects.ProductDetailPage;
import com.samplapp.konakartpageobjects.ShoppingCart;
import com.samplapp.konakartpageobjects.WelcomePage;
import com.samplapp.konakartpageobjects.checkoutFinshed;
import com.samplapp.konakartpageobjects.logoutPage;
import com.samplapp.utility.Log;

public class Paymentcheckout extends Baseclass {

	LoginPage login;
	HomePage homepage;
	ProductDetailPage prodsel;
	AddToCartPage addtocart;
	ShoppingCart shopcart;
	OrderConfirm orderconm;
	CheckoutConfirmation checkoutconfrm;
	checkoutFinshed checkfinished;
	logoutPage logout;
	WelcomePage welcompavenav;
	
	@Parameters("browser")
	@BeforeMethod(groups = {"smoke","regression"})
	public void setup(String browser) {

		launchApp(browser);

	}


	
	@AfterMethod(groups = {"smoke","regression"})
	public void tearDown() {
		getDriver().quit();

	}

	@Test(groups = {"smoke","regression"})
	public void ProductSelection() {
		Log.startTestCase("ProductSelection");
		login = new LoginPage();
		homepage = login.loginTest(prop.getProperty("username"), prop.getProperty("password"));
		Log.info("*******************loginPage Test Successfull**************************");
		prodsel = new ProductDetailPage();
		prodsel.addToCartTest();
		Log.info("*********************productdetailpageTest Successfull***************************************");
		addtocart = new AddToCartPage();
		shopcart = addtocart.shoppingCartTest();
		Log.info("*********************shoppingcartTest successfull***************************************");
		boolean result = shopcart.validateorderconfirm();
		AssertJUnit.assertTrue(result);
		orderconm = shopcart.checkoutTest();
		Log.info("*********************check out test succeessfull**************************************");
		orderconm = new OrderConfirm();
		boolean ordernavig = orderconm.orderConpagenavigation();
		AssertJUnit.assertTrue(ordernavig);
		Log.info("*********************order confirmation test succeessfull**************************************");
		checkoutconfrm = orderconm.orderConfirmationTest();
		checkoutconfrm = new CheckoutConfirmation();
		System.out.println("*********************order conf test two  succeessfull**************************************");
		boolean checknav = checkoutconfrm.checkoutPageNavigation();
		AssertJUnit.assertTrue(checknav);
		Log.info("*********************check out page navigation test succeessfull**************************************");
		checkfinished = checkoutconfrm.checkoutTest();
		checkfinished = new checkoutFinshed();
		logout = checkfinished.checoutSuccessfullTest();
		Log.info("*********************check out test succeessfull**************************************");
		logout = new logoutPage();
		welcompavenav = logout.logoutTest();
		Log.info("*********************Logout test succeessfull**************************************");
		welcompavenav = new WelcomePage();
		String actualUrl = welcompavenav.welcomePageTest();
		String expectedUrl = "http://10.0.1.232:8780/konakart/LogIn.action";
		AssertJUnit.assertEquals(actualUrl, expectedUrl);
		System.out.println("Navigated to = "+actualUrl);
		Log.info("*********************welcomepage test succeessfull**************************************");
		
		
		
		
		

	}

}
