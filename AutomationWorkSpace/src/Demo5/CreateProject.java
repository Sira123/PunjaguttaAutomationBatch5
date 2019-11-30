package Demo5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProject extends A {
	
	@BeforeMethod
	public void clickOnAddNewProject()
	{
		System.out.println("Successfully clicked on Add New Project");
		
	}
	
	@Test
	public void testCreateProject()
	{
		
		System.out.println("Successfully created Project");
	}

	@AfterMethod
	public void retreiveSuccessMsg()
	{
		
		System.out.println("retrieved success message ");
	}
	
     
	

}
