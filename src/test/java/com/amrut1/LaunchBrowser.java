package com.amrut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	//public WebDriver driver;
	
	@Test
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	}

}
