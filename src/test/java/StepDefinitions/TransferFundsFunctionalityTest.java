package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.*;

public class TransferFundsFunctionalityTest {

    HomePage homePage = new HomePage();

    @When("user click Transfer Funds")
    public void user_click_transfer_funds() {
        homePage.findAndClick("transferFundsButton");
    }
    @When("user select {string} From Account drop down menu")
    public void user_select_from_account_drop_down_menu(String fromAccountValue) {
        homePage.findAndSelectInList("fromAccountDropDown",fromAccountValue);
    }
    @When("user select {string} To Account drop down menu")
    public void user_select_to_account_drop_down_menu(String toAccountValue) {
        homePage.findAndSelectInList("toAccountDropDown",toAccountValue);

    }
    @And("user enter amount {string} in Transfer Fund page")
    public void userEnterAmountInTransferFundPage(String amountInput) {
        homePage.findAndSend("tfAmountInput",amountInput);
    }
    @When("user click Continue Button and Submit")
    public void user_click_continue_button_and_submit() {
        homePage.findAndClick("submitButton");
        homePage.findAndClick("submitButton");
    }



}
