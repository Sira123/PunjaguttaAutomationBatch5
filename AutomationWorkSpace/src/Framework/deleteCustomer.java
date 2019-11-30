package Framework;

import org.testng.annotations.Test;

public class deleteCustomer extends BaseClass{
	
	@Test
	public void testdeleteCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.SelectaCustomer("sira12");
		EditCustomerInformationPage ecip=new EditCustomerInformationPage();
		ecip.deleteCustomer();
		String s=apcp.retriveSuccessMessage();
		System.out.println(s);
	}
	
	

}
