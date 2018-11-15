package Railway;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Common.Utilities;
import Constant.Constant;

public class BaseTest {

	@BeforeClass
	protected void beforeMethod()
	{
		System.out.println("Pre-condition");
		System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath()+ "\\Executables\\chromedriver.exe");
		Constant.WEBDRIVER = new ChromeDriver();
		Constant.WEBDRIVER.manage().window().maximize();
		
	}
	
	@AfterClass
	protected void afterMethod()
	{
		System.out.println("Post-condition");
		Constant.WEBDRIVER.quit();
	}
}
