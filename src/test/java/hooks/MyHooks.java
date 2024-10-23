package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println(scenario.getName());
		System.out.println("Browser is opened");
	}
	
	@After
	public void teardown(Scenario scenario) {
		System.out.println(scenario.getName());
		System.out.println("Browser closed");
	}

}
