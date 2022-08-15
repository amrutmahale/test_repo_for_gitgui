package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	//identify webElement on webPage
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath= "//form/div[3]/button")
	WebElement loginbtn;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		username.clear();
		username.sendKeys(emailAdd);
	}
	public void enterpassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void loginbtn() {
		loginbtn.click();
	}
	public void clickonLogoutbtn() {
		logout.click();
	}
}

