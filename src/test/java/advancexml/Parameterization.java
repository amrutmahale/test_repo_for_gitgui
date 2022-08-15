package advancexml;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class Parameterization extends SeleniumUtility {
	
	
	@Parameters({ "browser" })
	@Test(priority=1)
	public void testCaseOne(String browser)
	{
		System.out.println("browser pass as chrome.."+ browser);
	}
	
	@Test(priority=2)
	@Parameters({ "username","password"})
	public void testCase2(String username,String password) {
		System.out.println("Parameter for username passed as:"+username);
		System.out.println("parameter for password passed as:"+password);
		
	}
	@Test(priority=4)
	@Parameters({"username","password","URL"})
	public void Actitimelogin(String username,String password,String URL) {
	
		SeleniumUtility.loginActititme(URL, username, password);
		
		
		
	}
	@Test(priority=3)
	@Parameters({"username","password","vtigerURL"})
	public void vtigerlogin(String username,String password,String vtigerURL) throws InterruptedException {
		utilityvtigerlogin(username, password,vtigerURL);
		
		
	}
	

}
