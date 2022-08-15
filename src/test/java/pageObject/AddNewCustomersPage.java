package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomersPage {
	
	public WebDriver driver;
	public AddNewCustomersPage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//nav/ul/li[4]/a/p/text()")
	WebElement customerIcon;
	
	@FindBy(xpath="//nav/ul/li[4]/ul/li[1]/a/p")
	WebElement customerMenuIcon;
	
	@FindBy(xpath="//form[1]/div/div/a") 
	WebElement addNewCustomers;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement enterEmail;
	//*[@id="Password"]
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement enterPassword;
	
	
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement firstName;

	@FindBy(id="Gender_Male")
	WebElement maleGender;

	@FindBy(id="Gender_Female")
	WebElement femaleGender;

	@FindBy(xpath="//*[@id='Company']")
	WebElement companyName;
	
	@FindBy(xpath="//*[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li[2]")
	WebElement newsletter;
	
	@FindBy(xpath="//*[@id=\"AdminComment\"]")
	WebElement addComment;
	
	public void custmerIconClick() {
		customerIcon.click();
	}
	public void clickOnCustomerMenuIcon() {
		customerMenuIcon.click();
	}
	public void clickOnAddNewButton() {
		addNewCustomers.click();
	}
	public void enterCustomersInfo() {
		enterEmail.sendKeys("amrutmahale@123.com");
		enterPassword.sendKeys("Test@123");
		firstName.sendKeys("amrut");
		lastName.sendKeys("Mahale");
	}


}
