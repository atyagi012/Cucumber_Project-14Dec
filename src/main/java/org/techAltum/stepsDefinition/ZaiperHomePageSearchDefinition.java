package org.techAltum.stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ZaiperHomePageSearchDefinition {


	@Given("User is on home page")
	public void user_is_on_home_page() {
	    System.out.println("A");
	}

	@Then("User enter some string in search text box")
	public void user_enter_some_string_in_search_text_box() {
		System.out.println("B");
	}

	@Then("Select item from search list")
	public void select_item_from_search_list() {
		System.out.println("C");
	}

	@Then("Click on item")
	public void click_on_item() {
		System.out.println("D");
	}

	@Then("Verify searchitem")
	public void verify_searchitem() {
		System.out.println("E");
	}
}
