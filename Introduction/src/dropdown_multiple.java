import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown_multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		
		/*int i = 1;
		while(i<5) 
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		*/
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		for(int i=1;i<6;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "6 Adult");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
	}

}
