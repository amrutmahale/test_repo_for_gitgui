package runner;

//import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/loginFeature.feature"}, // feature file or folder name
		glue = {"stepDefination"},// stepdefinition package names
		tags= "@Sanity" , 
		dryRun = false,// dryRun=true: useful for to test feature file implemented or not in stefDefination file
		//plugin = {"pretty","html:target/cucumber-reports/reports1.html"},//reporting
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
