package dynamicXpathwithTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	
	
	@Test
	public void getPagination() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//button[@class="btn-close"]
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']"))).click();
		//driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		System.out.println("close button click successfully");
		driver.findElement(By.xpath("//ul[@id='menu']/li[5]/a")).click();
		driver.findElement(By.xpath("//ul[@id='menu']/li[5]/ul/li/a")).click();
	}

}
