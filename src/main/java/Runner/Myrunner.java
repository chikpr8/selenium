package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(
		features = "C:\\java training\\FreecrmBDDFramework\\src\\main\\java\\Features\\login.feature", //the path of the feature files
		
		glue={"StepDefintions"},//the path of the step definition files
		 format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		 monochrome = true, //display the console o/p in a readable format
		 strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping b/w feature file  and step definition file
		)



public class Myrunner {

}
