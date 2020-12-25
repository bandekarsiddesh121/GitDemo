import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class end2endTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		// AutoSuggestive dropdown
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2500L);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
		}
		}
		
		Thread.sleep(2000L);
		
		
		// Click RadioButton
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
				{
					System.out.println("Its Enabled");
					Assert.assertTrue(true);
				}
		else
		{
			System.out.println("Its Disabled");
			Assert.assertTrue(false);
				}
				
		
		Thread.sleep(2000L);
		
		
		// Select Checkbox
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		Thread.sleep(2000L);
		
		
		// Dropdown Looping UI
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		for(int i=1;i<6;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		
		Thread.sleep(2000L);
		
		
		// Static Dropdown 
		
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("AED");
		s.selectByIndex(3);
		
		
		// Dynamic Dropdown 
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)'][contains(text(),'Chennai (MAA)')]")).click();
		
		

}

	
}