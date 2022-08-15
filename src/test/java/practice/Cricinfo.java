package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String actual="https://www.espncricinfo.com/";
		driver.get("https://www.espncricinfo.com");
		if(actual.equals(driver.getCurrentUrl())) {
			System.out.println("the url is verified...");
		}
		else
		{
			System.out.println("the page is  open invalid  page..");
		}
		List<WebElement> list=driver.findElements(By.cssSelector(" div.ds-popper-wrapper>a" ));
		
		int n=list.size();
		System.out.println(" the number of menu bar  is item is:"+n);
		for(int i=0;i<n;i++) {
			System.out.println("the menu item name is:"+(i+1)+":"+list.get(i).getText());
		}
	}

}
