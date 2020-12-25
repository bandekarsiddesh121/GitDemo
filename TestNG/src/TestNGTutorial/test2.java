package TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {


	@Test (enabled = false)
	public void TestThree() {
		
		System.out.println("TestThree");
	}
	
	
	
	@Parameters({"URL"})
	@Test
	public void TestFour(String urlname) {
		
		System.out.println(urlname);
	}
	
	
	
	@BeforeTest
	public void SuperTest() {
		
		System.out.println("I am always Before All Tests");
	}
	
}
