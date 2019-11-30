package Demo4;

import org.testng.annotations.Test;

public class Profile {

	@Test(groups="functional")
	public void functionalTesting()
	{
		System.out.println("Functional testing is done");
		
	}
	
	@Test(groups="integration")
	public void integrationTesting()
	{
		System.out.println("integration testing is done");
	}
	
	@Test(groups="system")
	public void systemTesting()
	{
		System.out.println("System testing is done");
	}

}
