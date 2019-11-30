package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public static WebDriver driver;
@BeforeTest
public void OpenBrowser()
{
   String browser="chrome";
   String url="http://127.0.0.1/login.do";
   if(browser.equals("firefox"))
   {
	   System.setProperty("webdriver.gecko.driver","C://drivers/geckodriver.exe");
	   driver=new FirefoxDriver();
	   
   }
   else if(browser.equals("chrome"))
   {
	   System.setProperty("webdriver.chrome.driver","C://drivers/chromedriver.exe");
	   driver=new ChromeDriver();
   }
   driver.get(url);
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   
 }
@AfterTest
public void closeBrowser()
{
	driver.close();
}

@BeforeClass
public void login()
{
	String un="admin";
 	String psd="manager";
  driver.findElement(By.name("username")).sendKeys(un);
  driver.findElement(By.name("pwd")).sendKeys(psd);
  driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}


@AfterClass
public void logout()
{
	driver.findElement(By.className("logoutImg")).click();
}
	
  
	
	

}
