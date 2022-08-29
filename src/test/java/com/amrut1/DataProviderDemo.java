package com.amrut1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	//@Test(dataProvider="searchDataset")
	@Test(dataProvider="searchDataset")
	public void TestCaseGoogleSearch(String country,String monument ) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country+""+monument);
		WebElement googlesearch=driver.findElement(By.name("btnK"));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.invisibilityOf(searchbox));
		List<WebElement> sugglist=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div[1]//div[@class=\"wM6W7d\"]/span"));
		int count=sugglist.size();
		System.out.println("the search sugg list of "+country+": "+monument);
		for(int i=0;i<count;i++) {
			System.out.println(sugglist.get(i).getText());
		}
		//googlesearch.submit();
		//driver.quit();
	}
	//@DataProvider(name="searchDataset")
	@DataProvider(name="searchDataset")
	public Object[][] searchData(){
		//Object[][] searchKeyword =new Object[3][2];
		Object[][] searchKeyword= new Object [3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutubminar";
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="TajMahal";
		searchKeyword[2][0]="Hydrabad";
		searchKeyword[2][1]="Charminar";
		return searchKeyword;
		
	}

}
