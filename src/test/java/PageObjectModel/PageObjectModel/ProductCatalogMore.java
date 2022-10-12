package PageObjectModel.PageObjectModel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ProductCatalogMore extends BaseClass{
	public String productName = "ZARA COAT 3";
	
	By products =By.cssSelector(".mb-3");
	By addToCart= By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");

	public List<WebElement> getProductsList(WebDriver driver) 
	  {
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		  CommonMethods.waitForElementToAppear(driver, driver.findElement(products));
		  List<WebElement> prod = driver.findElements(products);	
		  return  prod; 
	 }
	 
	public WebElement getProductByName(String productName)
	{
		
		WebElement prod1 = (WebElement) getProductsList(driver).stream().filter(products->
		products.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod1;	
	}

	@Test
	public void addProductToCart()
	{
		WebElement prod = getProductByName("ADIDAS ORIGINAL");
		prod.findElement(addToCart).click();	
		
	}
	}
