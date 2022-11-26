package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Googlestepdef {

	@Given("Google search {string}")
	public void google_search(String string) {
	System.out.println("Google search {string}");
	}

	@And("Enter search url\"www.google.com\"")
	public void enter_search_url_www_google_com() {
System.out.println("Enter search url\\\"www.google.com\\");
	}

	@When("to ensure that page will open or not")
	public void to_ensure_that_page_will_open_or_not() {
System.out.println("to ensure that page will open or not");
	}

}
