package TestNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {

	
	@Test(groups= {"Smoke"})
	public void TestFive() {
		
		System.out.println("TestFive");
	}
	
	
	
	@Parameters({"URL", "username"})
	@Test
	public void TestSix(String uname, String username) {
		
		System.out.println(uname);
		System.out.println(username);
		
	}
	
	
	
	@Test(dataProvider="getData")
	public void TestData(String user, String pass) {
		
		System.out.println(user);
		System.out.println(pass);
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username, password - Good Credit history
		//2nd combination - username password - Bad Credit History
		//3rd combination - fraud credit history
		
		Object[][] data= new Object[3][2];
		
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
				
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		

	
	
	}
}
