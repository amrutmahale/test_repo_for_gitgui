package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArena {
	
	@Test(enabled=false)
	public void Testcase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.gsmarena.com/");
		String actualURL="https://www.gsmarena.com/";
		if(actualURL.equals(driver.getCurrentUrl())) {
			System.out.println("the url is match and page is verified.....");
		}
		else {
			System.out.println("the page is invalid....");
		}
		List<WebElement> list=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix' ]>ul>li"));
		int n=list.size();
		System.out.println("the  number of element is that gsm arena:"+n);
		for(int i=0;i<20;i++) {
			System.out.println("the list of phones names is:"+(i+1)+":"+list.get(i).getText());
		}
	}
	@Test(enabled=false)
	public void getsamsungCount() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> list=driver.findElements(By.cssSelector("div[class=\"makers\"]>ul>li>a>strong"));
		int n=list.size();
		System.out.println("the list of samsung count is:"+n);
		
		for(int i=0;i<20;i++) {
			System.out.println("the type ofsamsung mobile is:"+(i+1)+":"+list.get(i).getText());
		}
		
		
		
	}
	@Test
	public void demoblaze() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.gsmarena.com/samsung-phones-9.php");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
			
	}
	

}
