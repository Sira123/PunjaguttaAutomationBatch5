package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("file:///C:/Users/microsoft/Desktop/superparent.html");
WebElement w1 = c1.findElement(By.xpath("//iframe[@src='parent.html']"));
c1.switchTo().frame(w1);
c1.findElement(By.xpath("//input[@placeholder='un']")).sendKeys("admin");
c1.findElement(By.xpath("//input[@placeholder='pwd']")).sendKeys("manager");
WebElement w2 = c1.findElement(By.xpath("//iframe[@src='child.html']"));
c1.switchTo().frame(w2);
c1.findElement(By.id("c1")).click();
//navigate frm child frame to parent frame
c1.switchTo().parentFrame();
c1.findElement(By.xpath("//input[@value='login']")).click();
c1.switchTo().defaultContent();
c1.findElement(By.id("c1")).click();






	}

}
	