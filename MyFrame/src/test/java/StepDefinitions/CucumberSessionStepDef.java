package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberSessionStepDef {
	
	@Before
	public void beforeScenario() {
		System.out.println("Output == Before");
	}
	@After
	public void afterScenario() {
		System.out.println("Output == After");
	}
	
	@BeforeStep
	public void beforeStepScenario() {
		System.out.println("Output == BeforeStep");
	}
	@AfterStep
	public void afterStepScenario() {
		System.out.println("Output == AfterStep");
	}
	
	
@When("This is when keyword")
public void This_Is_When() {
	System.out.println("Output == When");
}

@When("This is and keyword")
public void this_is_and_keyword() {
	System.out.println("Output == And");
}

@Then("This is then keyword")
public void this_is_then_keyword() {
	System.out.println("Output == Then");
}

@Given("This is given keyword")
public void this_is_given_keyword() {
	System.out.println("Output == Given");
}

@When("^This is \"(.*)\"$")
public void this_is_when(String parameter) {
	System.out.println(parameter);
}

@When("This is and")
public void this_is_and() {
	System.out.println("Output == And");
}

@Then("This is then")
public void this_is_then() {
	System.out.println("Output == Then");
}
}
