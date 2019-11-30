package Demo2;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=2)
	public void testCC()
	{
		System.out.println("testCC is executed");
	}

	@Test(priority=3)
	public void testAA()
	{
		System.out.println("testAA is executed");
	}
	
	@Test(priority=1)
	public void testBB()
	{
		System.out.println("testBB is executed");
	}
}
