package loginStepDef;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login1Page;

public class LoginStefdef {

	
	public WebDriver driver;
	public Login1Page loginpage;
	
	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		
		loginpage=new Login1Page(driver);
		
	   	}

	@When("User open the URL {string}")
	public void user_open_the_url(String string) {
		driver.get(string);
	   	}

	@And("User entered the email {string} and password as {string}")
	public void user_entered_the_email_and_password_as(String string, String string2) {
		loginpage.enteremail(string);
		loginpage.enterPassword(string2);
	   	}
	

	@And("Click on login button")
	public void click_on_login_button() {
		loginpage.loginbuton();
	   	}

	@Then("The page title should be a dashboard {string}")
	public void the_page_title_should_be_a_dashboard(String string) {
		String actual=string;
		Assert.assertEquals(actual, driver.getTitle());
		
	   	}

	@And("User click on Logout link")
	public void user_click_on_logout_link() {
		loginpage.logoutButton();
	    	}

	@Then("the page title should a login page {string}")
	public void the_page_title_should_a_login_page(String string) {
		String actual=string;
		Assert.assertEquals(actual, driver.getTitle(), "Title got changed");
	    	
	}

//	@And("User close the browser")
//	public void user_close_the_browser() {
//		driver.close();
//	   	}
	@After
	public void teardown(Scenario sc) throws IOException
	{
		if(sc.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File filesrc= ts.getScreenshotAs(OutputType.FILE);
			File filedest=new File(".\\src\\test\\resources\\ScreenShots\\loginfailedScenario.jpg");
			FileUtils.copyFile(filesrc, filedest);
			
		}
		driver.close();
	}
}
