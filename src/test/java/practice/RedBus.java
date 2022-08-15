package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	@Test
	public void redBus() {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String homepageId=driver.getWindowHandle();
	System.out.println("parent page or homepage windows id is:"+homepageId);
	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	Set<String> allwinId=driver.getWindowHandles();
	Iterator<String> itr=allwinId.iterator();
//	String homepageID=itr.next();
//	String childPageid=itr.next();
//	System.out.println("parent pag id is:"+homepageID);
//	System.out.println("the child page id:"+childPageid);
	List<String> list=new ArrayList<String>(allwinId);
	String parentWinId=list.get(0);
	String childWinId=list.get(1);
	System.out.println("the parent winid is:"+parentWinId);
	System.out.println("the child winid is:"+childWinId);
	
	// switch from one window to another windows
	driver.switchTo().window(parentWinId);
	System.out.println("the title of parent page is:"+driver.getTitle());
	driver.switchTo().window(childWinId);
	System.out.println("the title of child windows id: "+driver.getTitle());
	
	for(String s:list)
	{
		String title=driver.switchTo().window(s).getTitle();
		System.out.println(title);
	}
	driver.quit();
	}
}
