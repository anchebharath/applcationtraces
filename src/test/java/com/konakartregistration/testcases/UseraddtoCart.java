/**
 * 
 */
package com.konakartregistration.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.samplapp.base.Baseclass;
import com.samplapp.konakartpageobjects.AddToCartPage;
import com.samplapp.konakartpageobjects.HomePage;
import com.samplapp.konakartpageobjects.LoginPage;
import com.samplapp.konakartpageobjects.ProductDetailPage;
import com.samplapp.konakartpageobjects.ShoppingCart;

/**
 * @author banche
 *
 */
public class UseraddtoCart extends Baseclass{
	LoginPage login;
	HomePage homepage;
	ProductDetailPage prodsel ;
	AddToCartPage addtocart;
	ShoppingCart shopcart;
	
	
	@Parameters("browser")
	@BeforeMethod(groups = {"smoke","regression"})
	public void setup(String browser) {

		launchApp(browser);

	}


	
	@AfterMethod(groups = {"smoke","regression"})
	public void tearDown() {
		getDriver().quit();

	}
	@Test(groups = "smoke")
	public void ProductSelection() {
		login = new LoginPage();
		homepage = login.loginTest(prop.getProperty("username"), prop.getProperty("password"));
		 prodsel = new ProductDetailPage();
		 addtocart =  prodsel.addToCartTest();
		 shopcart = addtocart.shoppingCartTest();
		 System.out.println("clicked on shoppingcatlink");
		 
		 
		
		
	

}
}
