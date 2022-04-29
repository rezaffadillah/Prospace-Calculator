package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.Calculator.CalculatorPageAction;
import pagesfactory.Calculator.CalculatorPageValidation;
import pagesfactory.PageFactoryManager;
import pagesfactory.products.ProductsPageValidation;

public class CalculatorSteps {
    private final CalculatorPageAction action;
    private final CalculatorPageValidation calculatorPageValidation;

    public CalculatorSteps(TestContext context) {
        action = PageFactoryManager.getCalculatorPageAction(context);
        calculatorPageValidation = PageFactoryManager.getCalculatorPageValidation(context);
    }

    @Given("User is on the Prospace Factorial Calculator")
    public void userIsOnTheProspaceFactorialCalculator() {
        Assert.assertTrue(calculatorPageValidation.isOnCalculatorPage());
    }

    @When("User enters an integer on the text field")
    public void userEntersAnIntegerOnTheTextField() {
        action.inputInteger("5");
    }

    @And("User clicks on the Calculate button")
    public void userClicksOnTheCalculateButton() {
        action.clickButtonCalculate();
    }

    @Then("The result should be displayed")
    public void theResultShouldBeDisplayed() {
        Assert.assertTrue(calculatorPageValidation.isFactorialResultDisplayed());
    }

    @When("User clicks on the Terms & Conditions link")
    public void userClicksOnTheTermsConditionsLink() {
        action.clickButtonTerms();
    }

    @Then("The Terms & Conditions should be displayed")
    public void theTermsConditionsShouldBeDisplayed() {
        Assert.assertTrue(calculatorPageValidation.isOnTermsAndConditionsPage());
    }

    @When("User clicks on the Privacy link")
    public void userClicksOnThePrivacyLink() {
        action.clickButtonPrivacy();
    }

    @Then("The Privacy should be displayed")
    public void thePrivacyShouldBeDisplayed() {
        Assert.assertTrue(calculatorPageValidation.isOnPrivacyPage());
    }
}
