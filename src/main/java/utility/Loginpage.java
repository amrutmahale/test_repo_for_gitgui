package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	//constructor
	public Loginpage(WebDriver d){
		driver=d;
		// this method will create web element
		PageFactory.initElements(driver, this);
	}
	//identify web elements
	//identify username
	@FindBy(id="user-name")
	WebElement username;
	//identify password
	@FindBy(id="password")
	WebElement password;
	//identify loginButton
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}

}
