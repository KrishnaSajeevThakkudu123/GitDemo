package stepDefinition;

import Automation.Cucumber.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends Base{

	
	@Before("SmokeTest")
	public void beforevalidation() {
	
		System.out.println("before test");
	}


	@After("@SeleniumTest")
	public void aftervalidation() {

		driver.close();
		}
	}