package Demo5;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {
	
	@Test
	public void testSample()
     {
		
	SoftAssert s1=new SoftAssert();	
	  s1.assertTrue(2>1);
	  System.out.println("Assertion 1 executed");
		
	  s1.assertEquals("abc","xyz");
	  System.out.println("Assertion 2 executed");
		
	  
	   s1.assertTrue(10==10);
	   System.out.println("Assertion 3 executed");
	   
	   s1.assertEquals("pass","pass");
	   System.out.println("Assertion 4 executed");
	   s1.assertAll();
	  
	}

}
