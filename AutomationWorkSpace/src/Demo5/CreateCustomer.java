package Demo5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomer extends A {
	
	@BeforeMethod
	public void clickOnAddNewCustomer()
	{
		System.out.println("Successfully clicked on Add New  Customer");
		
	}
	
	@Test
	public void testCreateCustomer()
	{
		
		System.out.println("Successfully created Customer");
	}

	@AfterMethod
	public void retreiveSuccessMsg()
	{
		
		System.out.println("retrieved success message ");
	}
	
     
}
