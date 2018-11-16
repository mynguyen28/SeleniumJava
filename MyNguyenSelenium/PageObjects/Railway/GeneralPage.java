package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Utilities;

import Constant.Constant;

public class GeneralPage {
	
	private final String tabname = "//div[@id='$$']//span[normalize-space()='$$']";
	private final String welcomeMsg = "Welcome $$";
	
	//Elements
	protected WebElement getTabLogin()
	{
		String[] str= {"menu","Login"};
		String logintab = Utilities.replaceString(tabname,str);
//		String str = tabname.replace("$$", "Login");
		return Constant.WEBDRIVER.findElement(By.xpath(logintab));
	}
	
	protected WebElement getTabLogout()
	{
		String[] str= {"Log out"};
		String logouttab = Utilities.replaceString(tabname,str);
		return Constant.WEBDRIVER.findElement(By.xpath(logouttab));
	}

	protected WebElement getWelcomeMsg()
	{
		String[] str= {Constant.USERNAME};
		String logintab = Utilities.replaceString(welcomeMsg,str);
		return Constant.WEBDRIVER.findElement(By.xpath(logintab));
	}
	//Methods
	public LoginPage gotoLoginPage()
	{
		this.getTabLogin().click();
		return new LoginPage();
	}
	
	public Boolean isWelcomeMsgDisplayed()
	{
		return this.getWelcomeMsg().isDisplayed();
	}

}
