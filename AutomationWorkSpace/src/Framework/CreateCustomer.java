package Framework;

import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass 
{

	@Test
	public void testCreateCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
	ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	apcp.clickOnAddNewCustomerButton();
	AddNewCustomerPage ancp=new AddNewCustomerPage();
	ancp.enterCustomerName("sira12345600");
	ancp.clickOnCreateCustomer();
	String s=apcp.retriveSuccessMessage();
	System.out.println(s);
	
	}
}
