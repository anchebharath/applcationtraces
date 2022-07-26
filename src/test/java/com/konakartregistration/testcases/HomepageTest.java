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
import com.samplapp.konakartpageobjects.HomePage;
import com.samplapp.konakartpageobjects.LoginPage;

/**
 * @author banche
 *
 */
public class HomepageTest extends Baseclass{
	LoginPage login;
	HomePage homepage;
	
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
	public void productSearch() {
		login = new LoginPage();
		homepage = login.loginTest(prop.getProperty("username"), prop.getProperty("password"));
		homepage.homeTest();
		
		
	}

}
