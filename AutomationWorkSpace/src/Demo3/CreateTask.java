package Demo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateTask {
	
 @Test
 public void testCreateTask()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		  c1.get("http://127.0.0.1/login.do");
		  c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		c1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		
		WebElement w1=c1.findElement(By.name("customerId"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("sira");
		WebElement w2=c1.findElement(By.name("projectId"));
		Select s2=new Select(w2);
		s2.selectByVisibleText("selenium");
		c1.findElement(By.name("task[0].name")).sendKeys("abc");
		c1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		c1.findElement(By.className("logoutImg")).click();
       c1.close();
 }
	

}
