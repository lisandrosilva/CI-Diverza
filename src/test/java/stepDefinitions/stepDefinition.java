package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import resources.base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;


public class stepDefinition extends base{

	@Given("^Initialize the browser with FireFox$")
	public void initialize_the_browser_with_FireFox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Then("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        LandingPageBuson ld = new LandingPageBuson(driver);
		ld.ingPortal().sendKeys(arg1);
		ld.ingPortal1().sendKeys(arg2);
		ld.ingPortal11().click();
	}

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageBuson ld = new LandingPageBuson(driver);
		Thread.sleep(2000);
		ld.Search().click();
		Thread.sleep(2000);
	}

	@Then("^Verify products are displayed$")
	public void verify_products_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageBuson ld = new LandingPageBuson(driver);
		Thread.sleep(2000);
		ld.ListaRFC().sendKeys("CACX7605101P8");
		Thread.sleep(2000);
		ld.SearchRFC().click();
		Thread.sleep(2000);
		ld.ValidacionOK().click();
		Thread.sleep(2000);
		ld.ListaRFC().clear();
		Thread.sleep(2000);
		ld.CloseSearch().click();
	}

	@Then("^Log Out$")
	public void log_Out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPageBuson ld = new LandingPageBuson(driver);
		Thread.sleep(2000);
		ld.SignOut().click();
		Thread.sleep(2000);
		ld.CloseBotton().click();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		  {
			driver.close();
			
		}
	}
}