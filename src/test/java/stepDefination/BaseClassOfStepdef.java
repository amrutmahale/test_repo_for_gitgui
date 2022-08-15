package stepDefination;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;
import pageObject.SearchCustomer;

public class BaseClassOfStepdef {
	 public WebDriver driver;
	 public LoginPage page;
	 public SearchCustomer search;
	 public Properties readConfig;
	
}
