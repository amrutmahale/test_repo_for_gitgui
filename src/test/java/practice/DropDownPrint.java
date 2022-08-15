package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPrint {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
         List<WebElement> list =driver.findElements(By.cssSelector("div[class=xtXmba]"));
//		Select select=new Select(element);
         int n=list.size();
         System.out.println("the number of menu item is:"+ n);
         for(int i=0;i<n;i++) {
        	 System.out.println("Themenu item "+i+":"+list.get(i).getText());
         }
		//List<WebElement> element=driver.findElements(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/ul/li/a/div"));
		                                                       //*[@id="container"]/div/div[1]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/ul/li/a/div						
//		//select.selectByIndex(3);
//		int l=element.size();
//		System.out.println("the number of element is:"+l);
	}
	

}
