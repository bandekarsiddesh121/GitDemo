package TestNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

	
	@Test
	public void TestOne() {
		
		System.out.println("TestOne");
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void TestTwo() {
		
		System.out.println("TestTwo");
	}
	
	
	
	@BeforeMethod
	public void AlwaysBefore() {
		
		System.out.println("I will execute always BEFORE any other tests in this class");
	}
	
	
	
	@AfterMethod
	public void AlwaysAfter() {
		
		System.out.println("I will execute always AFTER any other tests in this class");
	}
	
}
