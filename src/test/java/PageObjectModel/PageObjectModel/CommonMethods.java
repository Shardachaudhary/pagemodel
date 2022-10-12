package PageObjectModel.PageObjectModel;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass{
		

	public static void waitForElementToAppear(WebDriver driver, WebElement element)
		{
			System.out.println("inside wait");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element))	;
		}
			
		public void waitForElementToDisappear(WebElement ele)
		{		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));	
		}
		
	}


