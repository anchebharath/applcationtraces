/**
 * 
 */
package com.konakartregistration.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
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
public class Userlogintest extends Baseclass {
	LoginPage login;
	HomePage homePage;
    
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
	public void Userone() {
		login = new LoginPage();
		homePage = login.loginTest(prop.getProperty("username"), prop.getProperty("password"));
		String actualUrl = homePage.getUrl();
		String expectedUrl = "http://10.0.1.232:8780/konakart/LoginSubmit.action";
		AssertJUnit.assertEquals(actualUrl, expectedUrl);
		System.out.println("Navigated to = "+actualUrl);

	}

}
