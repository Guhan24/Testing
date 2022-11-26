package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I want to write a step with precondition");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("some other precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I complete action");
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("some other action");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("yet another action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I validate the outcomes");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("check more outcomes");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println( "i_want_to_write_a_step_with_name1");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i_check_for_the_in_step(Integer int1)");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i_verify_the_success_in_step");
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i_want_to_write_a_step_with_name2");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i_verify_the_fail_in_step");
	}
	


}
