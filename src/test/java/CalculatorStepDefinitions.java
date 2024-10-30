import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CalculatorStepDefinitions {

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code here...
        throw new PendingException();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here...
        throw new PendingException();
    }

    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        // Write code here...
        throw new io.cucumber.java.PendingException();
    }
}
