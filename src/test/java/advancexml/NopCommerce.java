package advancexml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerce {
	
	@Parameters({"url","email1","password1"})
	@Test
	public void login(String url,String email1,String password1) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			System.out.println("the title of the webpage"+driver.getTitle());
			System.out.println("the current url of the page is "+ driver.getCurrentUrl());
			WebElement email=driver.findElement(By.cssSelector("div[class=form-fields]>div>input"));
			email.clear();
			email.sendKeys(email1);
			System.out.println("the text of the email is:"+email.getTagName());
			System.out.println("the eamil name is :"+email.getAttribute("value"));
			WebElement password=driver.findElement(By.cssSelector("div[class=form-fields]>*:nth-child(2)>input"));
			password.clear();
			password.sendKeys(password1);
			driver.findElement(By.xpath( "//div[@class='buttons']/button")).click();
			System.out.println("the after login title of the web page:"+ driver.getTitle());
			System.out.println("the after login url of the web page:"+ driver.getCurrentUrl());
			driver.quit();
	}
	

}
