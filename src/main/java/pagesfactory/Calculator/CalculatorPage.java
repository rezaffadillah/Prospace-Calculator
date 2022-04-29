package pagesfactory.Calculator;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//h1[@class='margin-base-vertical text-center']")
    WebElement pageTitle;

    @FindBy(id = "number")
    WebElement inpInteger;

    @FindBy(id = "getFactorial")
    WebElement btnCalculate;

    @FindBy(id = "resultDiv")
    WebElement textResult;

    @FindBy(xpath = "//a[.='Terms and Conditions']")
    WebElement btnTerms;

    @FindBy(xpath = "//a[.='Privacy']")
    WebElement btnPrivacy;

    public CalculatorPage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
