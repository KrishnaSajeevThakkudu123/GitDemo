package stepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Automation.Cucumber.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	public WebDriver driver;

	@Given("User is on Greenkart Landing Page")
	public void user_is_on_greenkart_landing_page() throws IOException {
	    
		driver=Base.getDriver();
		
	}
	@When("User Searched for {string} vegetables")
	public void user_searched_for_vegetables(String string) {
	    
		driver.findElement(By.xpath("//*[@placeholder='Search for Vegetables and Fruits']")).sendKeys(string);
		
	}
	@Then("{string} results are displayed")
	public void results_are_displayed(String string) throws InterruptedException {
	    
		System.out.println(string);
		Thread.sleep(600);
		System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	
	}
	
	@Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {

		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
		
    }

    @And("^added the item to cart$")
    public void added_the_item_to_cart() throws Throwable {
    	
    	Thread.sleep(600);
    	driver.findElement(By.xpath("//a[@class='increment']")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        
    }

    @And("^User Proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	
        
    }



}
