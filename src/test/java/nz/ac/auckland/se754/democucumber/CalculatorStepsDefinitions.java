package nz.ac.auckland.se754.democucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepsDefinitions {
    int num1, num2, result;

    @Given("I have entered the first number {int}")
    public void i_have_entered_the_first_number(Integer num1) {
        this.num1 = num1;
    }

    @Given("I have entered the second number {int}")
    public void i_have_entered_the_second_number(Integer num2) {
        this.num2 = num2;
    }

    @When("I press add")
    public void i_press_add() {
        result = Calculator.add(num1,num2);
    }

    @Then("The result is {int}")
    public void the_result_is(Integer int1) {
        assertEquals((int) int1, result);
    }


}
