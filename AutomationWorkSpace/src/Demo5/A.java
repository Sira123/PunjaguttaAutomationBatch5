package Demo5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A {
	
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.out.println("Browser opened");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		
		System.out.println("browser closed");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	@AfterClass
	public void logout()
	{
		
		System.out.println("Logout successfull");
	}
	

}
