package ParelleExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer {

    @Test	
	public void testCreateCustomer()
	{
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		FirefoxDriver c1=new FirefoxDriver();
		  c1.get("http://127.0.0.1/login.do");
		  c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
       c1.findElement(By.linkText("Projects & Customers")).click();
       c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys("sira13");
		c1.findElement(By.name("createCustomerSubmit")).click();
		c1.findElement(By.className("logoutImg")).click();
		c1.close();

	}
}
