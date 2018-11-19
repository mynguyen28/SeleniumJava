package Railway;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constant.Constant;

public class LoginTest extends BaseTest{
	
	private String validUsername = Constant.USERNAME;
	private String validPassword = Constant.PASSWORD;
	private String invalidPassword = "invalidPss";
	
	
	@Test
	public void TC01()
	{
		System.out.println("TC01 - User can log into Railway with valid username and password");
		HomePage homepage = new HomePage();
		homepage.open();
		LoginPage loginPage = homepage.gotoLoginPage();
		loginPage.submitLogin(validUsername, validPassword);
		Assert.assertTrue(loginPage.isWelcomeMsgDisplayed(), "Login is failed");
		//post-condition
		loginPage.logOut();
	}

	@Test
	public void TC02()
	{
		System.out.println("TC02 - User can't login with blank Username textbox");
		HomePage homepage = new HomePage();
		homepage.open();
		
		LoginPage loginPage = homepage.gotoLoginPage();
		loginPage.submitLogin("", validPassword);
		Assert.assertEquals(loginPage.getLoginError(), "There was a problem with your login and/or errors exist in your form.");
	}
	
	@Test
	public void TC03()
	{
		System.out.println("TC03 - User cannot log into Railway with invalid password");
		HomePage homepage = new HomePage();
		homepage.open();
		
		LoginPage loginPage = homepage.gotoLoginPage();
		loginPage.submitLogin(validUsername, invalidPassword);
		Assert.assertEquals(loginPage.getLoginError(), "Invalid username or password. Please try again.");
	}
	
	@Test
	public void TC04()
	{
		System.out.println("TC04 - Login page displays when un-logged User clicks on Book ticket tab");
		HomePage homepage = new HomePage();
		homepage.open();
		
		LoginPage loginPage = homepage.gotoLoginPage();
		loginPage.submitLogin(validUsername, invalidPassword);
		Assert.assertEquals(loginPage.getLoginError(), "Invalid username or password. Please try again.");
	}
}
