package pagesfactory;

import context.TestContext;
import pagesfactory.Calculator.CalculatorPageAction;
import pagesfactory.Calculator.CalculatorPageValidation;

public class PageFactoryManager {
    private static CalculatorPageAction calculatorPageAction;
    private static CalculatorPageValidation calculatorPageValidation;

    public static CalculatorPageAction getCalculatorPageAction(TestContext context) {
        return calculatorPageAction == null ? new CalculatorPageAction(context) : calculatorPageAction;
    }

    public static CalculatorPageValidation getCalculatorPageValidation(TestContext context) {
        return calculatorPageValidation == null ? new CalculatorPageValidation(context) : calculatorPageValidation;
    }
}
