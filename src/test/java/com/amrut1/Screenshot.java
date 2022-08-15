package com.amrut1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	@Test
	public void takeScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//take full sscreenshot
		//use interface TakesScreenshot
		//// downcast the driver to access TakesScreenshot method
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		// capture screenshot as output type FILE
		File fileref=ts.getScreenshotAs(OutputType.FILE);
		//save the capture screenshot
		
	File savefile=(new File(".\\src\\test\\resources\\ScreenShots\\HRMSearchPage.jpg"));
	FileUtils.copyFile(fileref, savefile);
	}

}
