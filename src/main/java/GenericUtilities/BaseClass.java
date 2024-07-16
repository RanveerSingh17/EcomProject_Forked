package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.Home_Page;
import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver sDriver;
	public WebDriver driver;
	public ExcelUtilities elib = new ExcelUtilities(); 
	public FileUtilities flib = new FileUtilities();
	public WebDriverUtilities wlib = new WebDriverUtilities();
	
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void bs()
	{
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups =  {"smokeTest","regressionTest"})
	public void bt()
	{
		System.out.println("parallel execution");
	}
	
	@BeforeClass(groups =  {"smokeTest","regressionTest"})
	public void bc() throws Throwable
	{
		 String BROWSER = flib.getKeyAndValueData("browser");
			if (BROWSER.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(BROWSER.equalsIgnoreCase("fireFox")) 
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else
			{
				driver = new ChromeDriver();
			}
					
		System.out.println("Browser launched");
		sDriver = driver;
	}

	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void bm() throws Throwable
	{
		  String url = flib.getKeyAndValueData("URL");
		  String email =flib.getKeyAndValueData("Email");
		  String password = flib.getKeyAndValueData("pwd");
		
		wlib.maximizeWindow(driver);
		wlib.WaitForElementToLoad(driver);
	    
		driver.get(url);	
		LoginPage login=new LoginPage(driver);
		login.LoginToApp(email, password);
		System.out.println("login to Application");
	}
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void am()
	{
		Home_Page HP = new Home_Page(driver);
		HP.logoutFromApp();
		System.out.println("logout from application");
	}
	
	@AfterClass(groups =  {"smokeTest","regressionTest"})
	public void ac()
	{
		
		wlib.quit(driver);
		System.out.println("close browser");
	}
	
	@AfterTest(groups =  {"smokeTest","regressionTest"})
	public void at()
	{
		System.out.println("parallel execution done");
	}
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void as()
	{
		System.out.println("close database");
	}

}
