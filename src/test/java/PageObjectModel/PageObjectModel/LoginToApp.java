package PageObjectModel.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToApp {
	
	By userEmail = By.id("userEmail");
	By password = By.id("userPassword");
	By submit = By.id("login");
	
	public void loginDetails(WebDriver driver, String user, String pwd) 
	{
	CommonMethods.waitForElementToAppear(driver, driver.findElement(userEmail));
	driver.findElement(userEmail).sendKeys(user);	
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(submit).click();
	}
}
