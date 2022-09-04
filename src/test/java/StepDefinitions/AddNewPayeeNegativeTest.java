package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNewPayeeNegativeTest {

    HomePage homePage = new HomePage();
    @Then("user should see warning message")
    public void user_should_see_warning_message() {
        homePage.findAndCheckIfEmpty("payeeNameInput");
    }



}
