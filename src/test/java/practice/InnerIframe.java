package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIframe {
	@Test
	public void inneriframe() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");//in outer frame we can switched
		driver.switchTo().frame(0); //here inside outer frame have one frame ,then on this 
									//frame we have switch so using switchTo().frame(0) first child that why 
		WebElement text=driver.findElement(By.xpath("//html/body/h1"));
		System.out.println("to get the inner iframe getText:"+text.getText());
		
		//if you want to go on your parent frame
		driver.switchTo().parentFrame();
		WebElement parentText=driver.findElement(By.xpath("//html/body/p"));
		System.out.println("the outer parent frame getText is:"+parentText.getText() );
	}
}
