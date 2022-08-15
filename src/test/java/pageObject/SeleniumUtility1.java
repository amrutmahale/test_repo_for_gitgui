package pageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility1 {

	public static void loginActititme(String URL,String username,String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);;
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys(password);;
		driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
	}
	public void utilityvtigerlogin(String username,String password,String url) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys(username);
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys(password,Keys.ENTER);
		Thread.sleep(2000);
	}
	public static WebDriver setUp(String browserName,WebDriver driver)
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
		
	}
}
