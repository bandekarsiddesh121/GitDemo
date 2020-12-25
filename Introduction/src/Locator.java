import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Deepa Harikant");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.linkText("Forgotten account?")).click();
	
	
	
	/* Using Xpath for buttons
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("Siddesh");
	driver.findElement(By.name("pw")).sendKeys("123456789");
	driver.findElement(By.id("Login")).click();
	
	//driver.findElement(By.className("button r4 wide")).click(); does not accept spaces
	
	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	*/
	
	/*
	// Using CssSelector for textbox fields
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.cssSelector("#username")).sendKeys("Siddesh");
	driver.findElement(By.cssSelector("#password")).sendKeys("12345");
	*/
	

	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	
	System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

	}