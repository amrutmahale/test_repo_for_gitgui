package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/features/login1.feature"},
		glue= {"loginStepDef"},//give package name
			//	/maven4/src/test/java/stepDefination/LoginStefdef.java
		dryRun =false,
		//plugin = {"pretty","html:target/cucumber-reports/reports1.html"},
		plugin= {"pretty","html:target/cucumber-reports/loginReports.html" },
		monochrome=true
		)

public class LoginRunner extends AbstractTestNGCucumberTests {
	

}
