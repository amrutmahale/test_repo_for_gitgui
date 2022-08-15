package runner;

import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features = { "src/test/resources/features"}, // feature file or folder name
		glue = { "CustomerStepDefinition"},// stepdefinition package names
		dryRun= true,// dryRun=true: useful for to test feature file implemented or not in stefDefination file
		plugin = {"pretty","html:target/cucumber-reports/CustomersReports1.html"},//reporting
		monochrome = true
		
		
		)


public class CustomerRunner {

}
