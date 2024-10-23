package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Given("User open search button")
	public void user_open_search_button() {
		System.out.println("User navigate to register account page");
	}

	@When("User enter valid product in to search field")
	public void user_enter_valid_product_in_to_search_field() {
		System.out.println("User navigate to register account page");
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
		System.out.println("User navigate to register account page");
	}

	@Then("Valid product should get displayed in seach result")
	public void valid_product_should_get_displayed_in_seach_result() {
		System.out.println("User navigate to register account page");
	}

	@When("User enter non-existing product in to search field")
	public void user_enter_non_existing_product_in_to_search_field() {
		System.out.println("User navigate to register account page");
	}

	@Then("proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
		System.out.println("User navigate to register account page");
	}

	@When("User do not enter product in to search field")
	public void user_do_not_enter_product_in_to_search_field() {
		System.out.println("User navigate to register account page");
	}
	
}
