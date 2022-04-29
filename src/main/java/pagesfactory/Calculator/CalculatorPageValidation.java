package pagesfactory.Calculator;

import context.TestContext;
import io.cucumber.java.an.E;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalculatorPageValidation extends CalculatorPage{
    public CalculatorPageValidation(TestContext context) {
        super(context);
    }

    public boolean isOnCalculatorPage() {
        return getWait().until(ExpectedConditions.visibilityOf(pageTitle)).isDisplayed();
    }

    public boolean isFactorialResultDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(textResult)).isDisplayed();
    }

    public boolean isOnTermsAndConditionsPage() {
        return getWait().until(ExpectedConditions.visibilityOf(textResult)).equals("This is the terms and conditions document. We are not yet ready with it. Stay tuned!\"");
    }

    public boolean isOnPrivacyPage() {
        return getWait().until(ExpectedConditions.visibilityOf(textResult)).equals("This is the privacy document. We are not yet ready with it. Stay tuned!");
    }
}
