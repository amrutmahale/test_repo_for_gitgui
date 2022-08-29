package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://www.google.com/");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.o);
		//driver.manage().window().maximize();
		WebElement searchInputField=driver.findElement(By.name("q"));
		searchInputField.sendKeys("Selenium Testing");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notification");
		//driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));
															//ul[@class="G43f7e"]/li[1]/div/div/div[1]/span
		int count=list.size();
		System.out.println("the number of suggestion is :"+count);
		//System.out.println("the 2 no sugg eleement is:"+list.get(2).getText());
		
	}

}
