package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				 glue ={"stepdefinitions","hooks"},
				 publish =true,
				 plugin= {"pretty",
						 "html:target/CucumberReport/cucumberreport.html",
						 "json:target/CucumberReport/cucumberreport.json",
						 "junit:target/CucumberReport/cucumberreport.xml"},
				 tags="@login or @register or @search",
				 dryRun=false)
public class TestRunner {
	

}
