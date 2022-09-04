package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPayeePositiveTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user navigate to the zero app")
    public void userNavigateToTheZeroApp() {
        BaseDriver.getDriver().get("http://zero.webappsecurity.com/login.html");
        BaseDriver.getDriver().manage().window().maximize();
    }

    @When("enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        loginPage.findAndSend("loginInput","username");
        loginPage.findAndSend("passwordInput","password");
        loginPage.findAndClick("signInButton");
        BaseDriver.getDriver().navigate().back();
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
        homePage.findAndContainsText("zeroBank","Zero Bank");
    }

    @When("user go to online Banking more services")
    public void userGoToOnlineBankingMoreServices() {
        homePage.findAndClick("moreServicesButton");
    }

    @Then("user click Pay Bills")
    public void userClickPayBills() {
        homePage.findAndClick("payBillsButton");
    }

    @When("user click Add New Payee")
    public void userClickAddNewPayee() {
        homePage.findAndClick("addNewPayeeButton");
    }

    @And("user enter {string}, {string}, {string} fields")
    public void userEnterFields(String payeeName, String payeeAddress, String account) {
        homePage.findAndSend("payeeNameInput",payeeName);
        homePage.findAndSend("payeeAddressInput",payeeAddress);
        homePage.findAndSend("accountInput",account);
        homePage.findAndClick("addButton");
    }

    @Then("user should be able to see success message")
    public void userShouldBeAbleToSeeSuccessMessage() {
        homePage.findAndContainsText("successMessage","success");
    }
}
