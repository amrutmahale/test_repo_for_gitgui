package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOpen {
	@Test
	public void OpeoAmazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");//1st function used
		System.out.println("the title of the page is:"+driver.getTitle());// 2nd function used
		String URL=driver.getCurrentUrl();//3rd function used
		System.out.println("the current page url is:"+URL);
		if(URL.equals("https://demo.actitime.com"))
		{
			System.out.println("the page is valided");
		}
		else {
			System.out.println("incorrect page url");	
		}
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username=driver.findElement( By.id("username"));
		
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement loginbtn=driver.findElement(By.id("loginButton"));
		WebElement element=wait.until(ExpectedConditions.visibilityOf(loginbtn));
		loginbtn.click();
		System.out.println("get a tagname of loginButton : " +loginbtn.getTagName());
		System.out.println("get a Text of username"+username.getText());//not show only visible 
		System.out.println("the gettext of password"+ password.getText());// text can show
		System.out.println("the gettext of loginbutton :"+ loginbtn.getText());//in this have visible text
		System.out.println("the getAttribute of username :" +username.getAttribute("value"));
		System.out.println("the getAttribute of password :" +password.getAttribute("value"));
		
		//WebElement TitleTrack=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[2]/a"));
		//                                                   
		//System.out.println("the gettext of TitleTrack: " +TitleTrack.getText());
		driver.findElement(By.partialLinkText("Approve Time-Track")).click();
		// here  getAtribute is print passed parameter value see above
		//driver.close();
		
	}

}
