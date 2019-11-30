package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindowBasedElements {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		  c1.get("http://127.0.0.1/login.do");
		  c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
        c1.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement w1 = c1.findElement(By.linkText("Projects & Customers"));
        Actions a1=new Actions(c1);
        a1.contextClick(w1).perform();
        Robot r1=new Robot();
        r1.keyPress(KeyEvent.VK_DOWN);
        r1.keyPress(KeyEvent.VK_DOWN);
        r1.keyPress(KeyEvent.VK_ENTER);        
        

	}

}
