package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
	WebDriver driver;
	public Login1Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//form/div[3]/button")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement logoutButton;
	
	public void enteremail(String email1) {
		email.clear();
		email.sendKeys(email1);
	}
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	public void loginbuton() {
		loginButton.click();
	}
	public void logoutButton() {
		logoutButton.click();
	}
}
