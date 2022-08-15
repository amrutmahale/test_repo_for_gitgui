package com.amrut1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	@Test(dataProvider="searchDataset")
	public void TestCaseGoogleSearch(String country,String monument ) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country+""+monument);
		WebElement googlesearch=driver.findElement(By.name("btnK"));
		googlesearch.submit();
	}
	@DataProvider(name="searchDataset")
	public Object[][] searchData(){
		Object[][] searchKeyword =new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutubminar";
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="TajMahal";
		searchKeyword[2][0]="Hydrabad";
		searchKeyword[2][1]="Charminar";
		return searchKeyword;
		
	}

}
