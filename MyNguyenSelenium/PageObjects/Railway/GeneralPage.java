package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Utilities;

import Constant.Constant;

public class GeneralPage {

	//Locators

	
	//Elements
	protected WebElement getTabMenu(String menu)
	{
		String tabname= "//div[@id='menu']//span[normalize-space()='"+ menu +"']";
		return Constant.WEBDRIVER.findElement(By.xpath(tabname));
	}

	protected WebElement getWelcomeMsg()
	{
		String welcomeMsg = "//div[@class='account' and normalize-space()='Welcome "+ Constant.USERNAME +"']";
		return Constant.WEBDRIVER.findElement(By.xpath(welcomeMsg));
	}
	//Methods
	public LoginPage gotoLoginPage()
	{
		this.getTabMenu("Login").click();
		return new LoginPage();
	}

	public Boolean isWelcomeMsgDisplayed()
	{
		return this.getWelcomeMsg().isDisplayed();
	}
	
	public void logOut()
	{
		this.getTabMenu("Log out").click();
	}

}

