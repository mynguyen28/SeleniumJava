package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class GeneralPage {
	
	private final String tabname = "//div[@id='menu']//span[normalize-space()='%s']";
	
	//Elements
	protected WebElement getTabLogin()
	{
		String logintab = tabname.replaceFirst("%s", "Login");
		return Constant.WEBDRIVER.findElement(By.xpath(logintab));
	}
	
	
	//Methods
	
//	protected void gotoMenuPage (String pagename)
//	{
//		this.tabname= pagename;
//		getTabMenu.click();
//	}
//
//	public LoginPage gotoLoginPage()
//	{
//		gotoMenuPage("Login");
//		return new LoginPage();
//	}
	public LoginPage gotoLoginPage()
	{
		this.getTabLogin().click();
		return new LoginPage();
	}
	
	
}
