package PageObjectModel.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
public WebDriver driver; 
	
	private WebDriver initdriver()
	{	
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 	
		//to get the required URL
		 driver.get("https://rahulshettyacademy.com/client");
		 return driver;
	}
	
	//Login process
	@BeforeMethod
	public void launchApplication()
	{
		driver = initdriver();
		LoginToApp lp = new LoginToApp();
		lp.loginDetails(driver, "anshika@gmail.com", "Iamking@000");	
	}
}
