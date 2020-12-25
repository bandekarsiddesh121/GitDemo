package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jdbc {

@Test	
public static void JDBC() throws SQLException {
	
	//DriverManager.getConnection("jdbc:mysql://localhost:3306/QADemo", "root", "admin");
	
	String host="localhost";

	String port= "3306";

	Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QADemo", "root", "admin");
	
	Statement s=con.createStatement();

	ResultSet rs=s.executeQuery("select * from employeeinfo where name='Ashvek'");

	while(rs.next())

	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

	driver.get("https://login.salesforce.com");

	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("location"));

	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("age"));

	
	}

	}

}
	

	

