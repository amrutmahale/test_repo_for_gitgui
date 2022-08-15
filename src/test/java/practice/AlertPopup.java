package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {
     
	@Test(enabled=true)
	public void Popup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//ul/li[1]/button")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//ul/li[2]/button")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//ul/li[2]/button")).click();
	Thread.sleep(3000);
	
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//ul/li[3]/button")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("so what i do");
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.navigate().to("https://www.redbus.in/");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	System.out.println("allert clicked succcefully");
	}
}
