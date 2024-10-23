package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("User navigate to register account page")
	public void user_navigate_to_register_account_page() {
		System.out.println("User navigate to register account page");
	}
	@When("User enter below details in to the fields")
	public void User_enter_below_details_in_to_the_fields(DataTable dataTable) {
		Map<String ,String> Map = dataTable.asMap(String.class,String.class);
		System.out.println(Map.get("firstname"));
		System.out.println(Map.get("lastname"));
		System.out.println(Map.get("email"));
		System.out.println(Map.get("mobilenumber"));
		System.out.println(Map.get("password"));
		System.out.println(Map.get("confirmpassword"));
		
	}

	@When("User enter firstname {string} in to firstname field")
	public void user_enter_firstname_in_to_firstname_field(String firstname) {
		System.out.println("User navigate to register account page");
	}

	@When("User enter lastname {string} in to lastname field")
	public void user_enter_lastname_in_to_lastname_field(String lastname) {
		System.out.println("User navigate to register account page");
	}

	@When("User enter e-mail {string} in to email field")
	public void user_enter_e_mail_in_to_email_field(String email) {
		System.out.println("User navigate to register account page");
	}

	@When("User enter mobile number {string} in to telephone field")
	public void user_enter_mobile_number_in_to_telephone_field(String mobileNumber) {
		System.out.println("User navigate to register account page");
	}

	@When("User enter password {string} in to password field")
	public void user_enter_password_in_to_password_field(String password) {
		System.out.println("User navigate to register account page");
	}

	@When("User enter confirm password {string} in to confirm password field")
	public void user_enter_confirm_password_in_to_confirm_password_field(String confirmPassword) {
		System.out.println("User navigate to register account page");
	}

	@When("Select privacy police field")
	public void select_privacy_police_field() {
		System.out.println("User navigate to register account page");
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
		System.out.println("User navigate to register account page");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println("User navigate to register account page");
	}

	@When("Select Yes for newsletter")
	public void select_yes_for_newsletter() {
		System.out.println("User navigate to register account page");
	}

	@When("User do not enter details in to any field")
	public void user_do_not_enter_details_in_to_any_field() {
		System.out.println("User navigate to register account page");
	}

	@Then("warning message should dispaly for all madatory fields")
	public void warning_message_should_dispaly_for_all_madatory_fields() {
		System.out.println("User navigate to register account page");
	}


}
