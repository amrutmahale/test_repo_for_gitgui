package pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchCustomer {

	public WebDriver driver;

	public SearchCustomer(WebDriver drivr) {
		driver = drivr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[id='SearchEmail']")
	WebElement searchEmail;

	@FindBy(id = "search-customers")
	WebElement searchBtn;

	@FindBy(xpath = "table[@role='grid']")
	WebElement searchEmailInTable;

	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr")
	List<WebElement> tableRow;

	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr[2]/td")
	List<WebElement> tableColumn;

	// @FindBy(xpath="//nav/ul/li[4]/a/p/text()")
	@FindBy(css = "nav > ul > li:nth-child(4) > a > p")
	WebElement customerIcon;

	@FindBy(xpath = "//nav/ul/li[4]/ul/li[1]/a/i")
	//// nav/ul/li[4]/ul/li[1]/a/i
	WebElement customerMenuIcon;

	@FindBy(xpath = "//*[@id='SearchFirstName']")
	WebElement firstname;

	@FindBy(xpath = "//*[@id='SearchLastName']")
	WebElement lastname;

	public void custmerIconClick() {
		customerIcon.click();
	}

	public void clickOnCustomerMenuIcon() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		customerMenuIcon.click();
	}

	public void enterEmailAdd(String email) {
		searchEmail.sendKeys(email);

	}

	public void enterFirstname(String fname) {
		firstname.sendKeys(fname);
	}

	public void enterLastname(String lname) {
		lastname.sendKeys(lname);
	}

	public void clickOnSearchButton() {
		searchBtn.click();
	}
	// //*[@id="customers-grid"]/tbody/tr : total rows

	// *[@id="customers-grid"]/tbody/tr[2]/td : total column
	public boolean searchcustomerByEmail(String email) {
		boolean found = false;
		int totalRow = tableRow.size();
		// int totalColumn=tableColumn.size();
		for (int i = 1; i < totalRow; i++) {
			System.out.println("searching row:" + i);
			WebElement webElementEmail = driver
					.findElement(By.xpath("//*[@id='customers-grid']//tbody/tr[" + i + "]/td[2]"));
			String actualEmail = webElementEmail.getText(); //// table/tbody/tr[1]/td[2]
			if (actualEmail.equals(email)) {
				found = true;
			}

		}
		return found;
	}

	public boolean searchCustomerByName(String expectedfirstname) {
		int totalRow = tableRow.size();
		boolean found = false;
		System.out.println("searching row:" + totalRow);
		System.out.println();
		for (int i = 1; i < totalRow; i++)
		{
			System.out.println("searching row:" +i);
			WebElement WebElementfirstname = driver.findElement(By.xpath("//*[@id='customers-grid']//tbody/tr[" +i + "]/td[3]"));
			String actualName = WebElementfirstname.getText(); //// tbody/tr/td[3]
			// //*[@id="customers-grid"]/tbody/tr/td[3]
			if(actualName.equals(expectedfirstname)) {
				found=true;
			}
		}
		return found;
	}

}
