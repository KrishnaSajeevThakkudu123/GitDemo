package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        
		System.out.println("user navigated to url");
    }
	
	 @When("^User login into the application with (.+) and (.+)$")
	    public void user_login_into_the_application_with_and(String username, String password) throws Throwable {    
		System.out.println(username);
		System.out.println(password);
    }
	
	@When("^User signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        
        System.out.println( obj.get(0).get(0));
        System.out.println( obj.get(0).get(1));
        System.out.println( obj.get(0).get(2));
        System.out.println( obj.get(0).get(3));
    }


	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home page validated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	
    	System.out.println("card details displayed");
        
    }
    
    @Given("^Validate Browser$")
    public void validate_browser() throws Throwable {
    	System.out.println("Browser validated");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
      System.out.println("Browser triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser stsrted");
    }



}
