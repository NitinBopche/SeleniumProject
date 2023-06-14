package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberConceptStepDef {
//
//	@Before
//	public void beforeScenario() {
//		System.out.println("Output == Before");
//	}
//	@After
//	public void afterScenario() {
//		System.out.println("Output == After");
//	}
		
//	@BeforeStep
//	public void beforeStepScenario() {
//		System.out.println("Output == BeforeStep");
//	}
//	@AfterStep
//	public void afterStepScenario() {
//		System.out.println("Output == AfterStep");
//	}
	
	@When("This is when keyword of the first scenario")
	public void this_is_when_keyword_of_the_first_scenario() {
	    System.out.println("Output == When");
	}

	@When("This is the and keyword of the first scenario")
	public void this_is_the_and_keyword_of_the_first_scenario() {
System.out.println("Output == And");
	}

	@Then("This is the then keyword of the first scenario")
	public void this_is_the_then_keyword_of_the_first_scenario() {
		System.out.println("Output == Then");
	}
	
	@Given("This is the given keyword using before every scenario")
	public void this_is_the_given_keyword_using_before_every_scenario() {
		System.out.println("Output == Given");
	}
//	\"([^\"]*)\"
	@When("^This is when keyword using \"(.*)\"$")
	public void this_is_when_keyword_using(String parameter) {
	System.out.println( parameter);
	}
}
