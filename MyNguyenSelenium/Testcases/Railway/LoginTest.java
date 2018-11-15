package Railway;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void TC01()
	{
		System.out.println("TC01 - User can log into Railway with valid username and password");
		HomePage homepage = new HomePage();
		homepage.open();
		
		LoginPage loginPage = homepage.gotoLoginPage();
		
		Assert.assertTrue(loginPage.isWelcomeMsgDisplayed(), "login fail");
	}

}
