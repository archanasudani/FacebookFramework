package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
    @Given("^That the user is navigated to the Facebook login page $")
    public void step() {
        System.out.println(" I am in GIVEN");
    }
    @When("^The login page is sucessfully opened $")
    public void step1() {
        System.out.println("\n I am in WHEN");
    }

    @Then("^my cursor is sucessfully positioned in username$")
    public void step2() {
        System.out.println("\n I am in THEN");
    }
}