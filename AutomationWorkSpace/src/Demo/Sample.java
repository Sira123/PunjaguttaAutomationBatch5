package Demo;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
  c1.get("http://127.0.0.1/login.do");
c1.findElement(By.name("username")).sendKeys("admin"+Keys.CONTROL+"a"+"c");
c1.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");

















  
  
  
  
  
  
  
  
  
 
		
		
	}

}
