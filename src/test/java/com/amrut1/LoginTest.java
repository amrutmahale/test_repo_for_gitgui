package com.amrut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Loginpage;

public class LoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Loginpage page=new Loginpage(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		page.enterUsername("standard_user");
		page.enterpassword("secret_sauce");
		page.clickOnLoginBtn();

	}

}
