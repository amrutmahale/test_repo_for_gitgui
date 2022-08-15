package com.amrut1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoScrenshot {
	    @Test
		public void logoScreen() throws IOException
		{
	    	WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElement section=driver.findElement(By.xpath("//*[@id='content']/div[2]/span"));
			File filref=section.getScreenshotAs(OutputType.FILE);
			File fileSave=new File(".\\src\\test\\resources\\ScreenShots\\LogoHrmPage.jpg");
			FileUtils.copyFile(filref, fileSave);
			driver.close();
		}
}
