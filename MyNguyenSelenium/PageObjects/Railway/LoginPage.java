package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class LoginPage extends GeneralPage{
	
	private final String username = "username";
	private final String password = "password";
	private final String login = "//input[@title='Login']";
	private final String loginError = "//p[@class='message error LoginForm' and normalize-space()='There was a problem with your login and/or errors exist in your form.']";
	
	public WebElement getUsername()
	{
		return Constant.WEBDRIVER.findElement(By.id(username));
	}

	public WebElement getPassword()
	{
		return Constant.WEBDRIVER.findElement(By.id(password));
	}
	
	public WebElement getLogin()
	{
		return Constant.WEBDRIVER.findElement(By.xpath(login));
	}
	
	public WebElement getLoginError()
	{
		return Constant.WEBDRIVER.findElement(By.xpath(loginError));
	}
	
	//Methods
	public void submitLogin(String username, String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLogin().click();
	}
	public HomePage login(String usename, String password)
	{
		submitLogin(usename, password);
		return new HomePage();
	}

}
