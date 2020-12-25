package com.pr.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).
		 * sendKeys("sri"); Thread.sleep(3000);
		 * driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		 * sendKeys("amd");
		 */
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Srinagar (SXR)']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=' Bengaluru (BLR)'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[19]")).click();
		
		
		
		
		//driver.close();
		
		
	}

}
