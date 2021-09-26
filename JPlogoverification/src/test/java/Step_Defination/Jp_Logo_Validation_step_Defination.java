package Step_Defination;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.BaseClass;
import Page_Object.Jp_logo_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jp_Logo_Validation_step_Defination {
	Logger logger = Logger.getLogger("login_step_Defination");
	public WebDriver driver;
	
	
	@Given("^User open the Google on the browser$")
	public void user_open_the_Google_on_the_browser() throws Throwable {
		driver = Hooks.driver;
	}

	@When("^User pass the search input as \"([^\"]*)\" and cliks on google serach button$")
	public void user_pass_the_search_input_as_and_cliks_on_google_serach_button(String user_input) throws Throwable {
		
		PageFactory.initElements(driver, Jp_logo_page_object.class);
		Jp_logo_page_object.send_value(Jp_logo_page_object.google_search_input, user_input);
		BaseClass.click_element(Jp_logo_page_object.click_outside);	
		BaseClass.click_element(Jp_logo_page_object.google_search_button);
	}

	@When("^User click on first result returned by Google$")
	public void user_click_on_first_result_returned_by_Google() throws Throwable {		
		BaseClass.click_element(Jp_logo_page_object.google_search_results);
	}

	@Then("^User should be also to see the J\\.P\\. Morgan logo$")
	public void user_should_be_also_to_see_the_J_P_Morgan_logo() throws Throwable {
		boolean value= BaseClass.get_text_element(Jp_logo_page_object.jp_morgan_logo);
				
		try {
			Assert.assertEquals(true, value);
			logger.info("Assertion Passed");
			logger.info("J.P. Morgan logo present");
		} catch (AssertionError e) {
			logger.info("Assertion Failed");
			logger.info("J.P. Morgan logo present");
			throw e;

		}		
	}

}
