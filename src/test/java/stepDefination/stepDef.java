package stepDefination;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import pageObject.SearchCustomer;
import pageObject.SeleniumUtility1;
import utility.SeleniumUtility;

public class stepDef extends BaseClassOfStepdef {
	
	@Before("@Sanity")
	public void setup1() {
		System.out.println("setup @Sanity method executed...");
		//readConfig =new Properties();//initialize class
		//String browser=readConfig.ge
		//SeleniumUtility1.setUp("chrome",driver);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Before("@Regression")
	public void setup2() {
		System.out.println("@Regression method executed...");
		//SeleniumUtility.setUp("firefox",driver);
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	  //# stepDefination.stepDef.user_launch_chrome_browser()
	 
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		 page=new LoginPage(driver);
		 search= new SearchCustomer(driver);
	}

	@When("user open URL {string}")
	public void user_open_url(String string) {
		driver.get(string);

	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String string, String string2) {
		page.enterEmail(string);
		page.enterpassword(string2);
	}
  
	@When("Click login button")
	public void click_login_button() {
		page.loginbtn();
	}

	@Then("page title should be a dashboard {string}")
	public void page_title_should_be_a_dashboard(String expected) {
		//Assert.assertEquals(driver.getTitle(),expected "title got changed");
		Assert.assertEquals("title got changed", expected, driver.getTitle());
		//System.out.println("the tile of dashboard is: "+driver.getTitle());
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
		
		page.clickonLogoutbtn();
	}

	@Then("page  title should be {string}")
	public void page_should_be(String homeExpected) {
		 String afterLogoutTitle=driver.getTitle();
		 //Assert.assertEquals(afterLogoutTitle,homeExpected);
		 Assert.assertEquals("home page title got changed", homeExpected, afterLogoutTitle);
		 System.out.println("aafter logout the tile of page is that :"+afterLogoutTitle);
	}
	
	
	//customer email search
	 @When("^User open URL \"([^\"]*)\"$")
	    public void user_open_url_something(String strArg1)  {
		 driver.get(strArg1);
	    }
	 @Then("^User can view Dashboard$")
	    public void user_can_view_dashboard()  {
		  String pageTitle="Dashboard / nopCommerce administration";
		  Assert.assertEquals("title got changed", pageTitle, driver.getTitle());
	    }

	 @When("^User click on Customer menu$")
	    public void user_click_on_customer_menu()  {
		 search.custmerIconClick();
	        }
	 
	 
	@And("^Enter customer Email$")
    public void enter_customer_email() 
    {
		search.enterEmailAdd("brenda_lindgren@nopCommerce.com");
       
    }
	
	@And("^Click on customer menuitem$")
    public void click_on_customer_menuitem() throws InterruptedException  {
		search.clickOnCustomerMenuIcon();
        }

	 
	 @When("^Click on Search button$")
	    public void click_on_search_button()  {
	        search.clickOnSearchButton();
	    }


	
	
	 @Then("^User Should found Email in the search table$")
	    public void user_should_found_email_in_the_search_table() {
		 String expectedEmail="brenda_lindgren@nopCommerce.com";
		 Assert.assertTrue(search.searchcustomerByEmail(expectedEmail));
	       
	    }
	 @Then("^User Should found firstname and lastname in the search table$")
	    public void user_should_found_firstname_and_lastname_in_the_search_table() {
	      search.searchCustomerByName("John");
	    }

	    @And("^Enter customer FirstName$")
	    public void enter_customer_firstname() {
	        search.enterFirstname("John");
	    }

	    @And("^Enter customer LastName$")
	    public void enter_customer_lastname(){
	        search.enterLastname("Smith");
	    }

	
	
	
//	@Then("Close the browser")
//	public void close_the_browser() {
//		driver.close();

//	}
	
//	@After
//	public void teardown(Scenario sc) throws IOException
//	{
//		
//		if(sc.isFailed()==true) 
//		{
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File srcFile= ts.getScreenshotAs(OutputType.FILE);
//			File  fileSave=new File(".\\src\\test\\resources\\ScreenShots\\failedscenario.jpg");
//			FileUtils.copyFile(srcFile, fileSave);
//		}
//		System.out.println(" @after scenario executed..");
//		
//		driver.quit();
//	}
//    @BeforeStep
//	public void beforestepMethod() {
//		System.out.println("beforestep hooks executed");
//	}
    @AfterStep
	public void addScreenshot(Scenario  scenario)
	
    {
    	final byte[] screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	//attach image file report(data, media type ,name of the attachment)
    	scenario.attach(screenshot, "image/png", scenario.getName());
    	
		//System.out.println("after step hooks executed");
	}
}
