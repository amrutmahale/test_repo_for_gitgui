package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysOparion {

	@Test(enabled = false)
	public void keyfunction() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = driver.findElement(By.cssSelector("input[id='username']"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin");
		Thread.sleep(2000);
		username.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"));
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(Keys.chord(Keys.CONTROL, "v"), Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}

	@Test(enabled = false)
	public void mouseoperation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String usernameField = driver.switchTo().activeElement().getAttribute("placeholder");
		System.out.println("validate active element:" + usernameField.equals("Username"));
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin", Keys.chord(Keys.CONTROL, "a"),
				Keys.chord(Keys.CONTROL, "c"), Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		driver.close();
	}

	@Test(enabled = false)
	public void operation1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.espncricinfo.com");
		Actions action = new Actions(driver);
		List<WebElement> mainMenus = driver.findElements(By.cssSelector("div[class='ds-popper-wrapper']>a"));

		for (int i = 0; i < mainMenus.size(); i++) {
			System.out.println("the main menus are :" + (i + 1) + ":" + mainMenus.get(i).getText());

			action.moveToElement(mainMenus.get(i)).perform();
			Thread.sleep(2000);
		}

		// List<WebElement>
		// subMenu=driver.findElements(By.cssSelector("ui.espncrickinfo.en-in>//none))

	}

	@Test
	public void operation2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		username.sendKeys("admin");
		Actions action = new Actions(driver);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"),
				Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

}
