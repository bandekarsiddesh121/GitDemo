import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] itemsNeeded= {"Cucumber", "Tomato", "Beans"};
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		AddItem(driver,itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.container div.products-wrapper:nth-child(2) div.products div:nth-child(4) div.promoWrapper:nth-child(1) > span.promoInfo:nth-child(4)")));
		
		System.out.println(driver.findElement(By.cssSelector("div.container div.products-wrapper:nth-child(2) div.products div:nth-child(4) div.promoWrapper:nth-child(1) > span.promoInfo:nth-child(4)")).getText());
		
		
		
		
		
		
	}
		
		
	
	
	
	
	public static void AddItem(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						
				if(j==itemsNeeded.length)
				{
					break;
				}
		}
		
		
		}
		
}
	
}