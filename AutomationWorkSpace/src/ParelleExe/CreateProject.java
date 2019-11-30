package ParelleExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProject {

	
 @Test
 public void testCreateProject()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		  c1.get("http://127.0.0.1/login.do");
		  c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		 c1.findElement(By.linkText("Projects & Customers")).click();
		  c1.findElement(By.xpath("//input[@value='Add New Project']")).click(); 
		 WebElement w1=c1.findElement(By.name("customerId"));
		  Select s=new Select(w1);
		  s.selectByVisibleText("sira");
		c1.findElement(By.name("name")).sendKeys("seleniumabcd");
		c1.findElement(By.name("createProjectSubmit")).click();	
		c1.findElement(By.className("logoutImg")).click();
		c1.close();
 }

}
