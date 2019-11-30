package Framework;

import org.testng.annotations.Test;

public class CreateProject  extends BaseClass{
	
	@Test
	public void testCreateProject()
	{
		
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
	ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	apcp.clickOnAddNewProjectButton();
	AddNewProjectPage anpp=new AddNewProjectPage();
	anpp.selectCustomerFromDropdown("sira");
	anpp.enterProjectName("qspiderandjspiders");
	anpp.clickOnCreateProjectButton();
	String s=apcp.retriveSuccessMessage();
	System.out.println(s);
	}

}





