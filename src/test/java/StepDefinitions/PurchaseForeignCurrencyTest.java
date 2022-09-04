package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.*;

public class PurchaseForeignCurrencyTest {

    HomePage homePage = new HomePage();
    @When("user click Purchase Foreign Currency")
    public void user_click_purchase_foreign_currency() {
        homePage.findAndClick("purchaseForeignCurrencyButton");

    }
    @Then("user should be able to select Currency with USD radio button")
    public void user_should_be_able_to_select_currency_with_usd_radio_button() {
        homePage.findAndSelectInList("currencyDropDown","AUD");
        homePage.findAndClick("usDollarRadioButton");
    }
    @Then("user enter amount {string}")
    public void user_enter_amount(String amount) {
        homePage.findAndSend("pcAmountInput",amount);
    }
/*    @Then("user click Calculate Cost button and verify Conversion Amount")
    public void user_click_calculate_cost_button_and_verify_conversion_amount() {
        System.out.println("Calculation Verified");
    }*/
    @When("user click Purchase Button")
    public void user_click_purchase_button() {
        homePage.findAndClick("purchaseButton");
    }

}
