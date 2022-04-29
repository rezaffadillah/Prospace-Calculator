package pagesfactory.Calculator;

import context.TestContext;

public class CalculatorPageAction extends CalculatorPage{
    public CalculatorPageAction(TestContext context) {
        super(context);
    }

    public CalculatorPageAction inputInteger(String integer) {
        inpInteger.sendKeys(integer);
        return this;
    }

    public CalculatorPageAction clickButtonCalculate() {
        btnCalculate.click();
        return this;
    }

    public CalculatorPageAction clickButtonTerms() {
        btnTerms.click();
        return this;
    }

    public CalculatorPageAction clickButtonPrivacy() {
        btnPrivacy.click();
        return this;
    }
}
