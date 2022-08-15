package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	@Test(enabled=false)
	public void demoblaze() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.cssSelector("div[class='list-group']>a"));
		int n=list.size();
		for(int i=0;i<n;i++) {
			WebElement cat=list.get(i);
			System.out.println("element is:"+cat.getText());
			System.out.println("isdisplayed|:"+cat.isDisplayed());
			System.out.println("is enabled|:"+cat.isEnabled());
		}
	}
	@Test
	public void Dropdown() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	     driver.get("https://artoftesting.com/samplesiteforselenium");
	     // first if you have to find select class id or any unique element
	     WebElement element=driver.findElement(By.id("testingDropdown"));
	     //then create select class constructor and pass select class is in constructor
	     Select select=new Select(element);
	  //then  create a list to add all element in list  using getOptions method
	     List<WebElement> list=select.getOptions();
	     System.out.println("the first element is :"+list.get(1).getText());
	     System.out.println("the 3rd element is :"+list.get(3).getText());
	     select.selectByIndex(3);
	     Thread.sleep(3000);
	     select.selectByIndex(2);
	     Thread.sleep(3000);
	     select.selectByVisibleText("Database Testing");
	     Thread.sleep(3000);
	    // select.deselectByIndex(3);
	     
	     for(int i=0;i<list.size();i++) {
	    	 System.out.println("the dropdown element are: "+list.get(i).getText());
	     }
	     
	}
}
