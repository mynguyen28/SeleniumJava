package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class LoginPage extends GeneralPage{
	
	private final String username = "username";
	private final String password = "password";
	private final String login = "//input[@title='Login']";
	private final String loginError = "//p[@class='message error LoginForm']";
	
	public WebElement getEleUsername()
	{
		return Constant.WEBDRIVER.findElement(By.id(username));
	}

	public WebElement getElePassword()
	{
		return Constant.WEBDRIVER.findElement(By.id(password));
	}
	
	public WebElement getEleLogin()
	{
		return Constant.WEBDRIVER.findElement(By.xpath(login));
	}
	
	public WebElement getEleLoginError()
	{
		return Constant.WEBDRIVER.findElement(By.xpath(loginError));
	}
	
	//Methods
	public void submitLogin(String username, String password)
	{
		getEleUsername().sendKeys(username);
		getElePassword().sendKeys(password);
		getEleLogin().click();
	}
	public HomePage login(String usename, String password)
	{
		submitLogin(usename, password);
		return new HomePage();
	}
	
	public String getLoginError()
	{
		return this.getEleLoginError().getText();
	}

}
