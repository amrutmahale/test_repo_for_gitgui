package DemoPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		String driverPath1="C:\\Users\\amrut mahale\\new2018\\eclipse-workspace\\SeleniumPractices2\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath1);
    	WebDriver driver= new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		  WebDriver driver=new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		  driver.get("https://www.google.com/");

	}

}
