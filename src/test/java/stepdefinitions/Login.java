package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	
	@Given("^User Navigate to login page$")
	public void user_navigate_to_login_page() {
		System.out.println("--> User navigated to a login page");

	}

	@When("User enter valid username {}")
	public void user_enter_valid_username(String username) {
		System.out.println("--> User enter valid username"+ username);

	}

	@And("User enter valid password {}")
	public void user_enter_valid_password(String password) {
		System.out.println("--> User enter valid password "+ password);
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("--> User should click on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("--> User should login sucessfully ");

	}

	@When("User enter invalid username {string}")
	public void user_enter_invalid_username(String username) {
		System.out.println("--> User should enter invalid username" + username);
	}

	@When("User enter invalid password {string}")
	public void user_enter_invalid_password(String password) {
		System.out.println("--> User should enter invalid password" + password);
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("--> User should get proper warning message");
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		System.out.println("--> User should get proper warning message");
	}

}
