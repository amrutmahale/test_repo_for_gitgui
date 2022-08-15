package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	@Test(enabled=false)
	public void rightClickAction() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button=driver.findElement(By.xpath("//section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(button).perform();
	}
	
	@Test
	public void doubleclick() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
		WebElement text=driver.findElement(By.xpath("*//p[2]"));
		System.out.println("the text is :"+text.getText());
		WebElement button=driver.findElement(By.xpath("//body/button" ));
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
	}
}
