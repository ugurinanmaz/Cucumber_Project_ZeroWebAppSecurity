package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Parent {

    public HomePage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Zero Bank']")
    private WebElement zeroBank;
    @FindBy(id = "online-banking")
    private WebElement moreServicesButton;

    @FindBy(id = "pay_bills_link")
    private WebElement payBillsButton;
    @FindBy(xpath = "//a[text()='Add New Payee']")
    private WebElement addNewPayeeButton;
    @FindBy(id = "np_new_payee_name")
    private WebElement payeeNameInput;
    @FindBy(id = "np_new_payee_address")
    private WebElement payeeAddressInput;
    @FindBy(id = "np_new_payee_account")
    private WebElement accountInput;
    @FindBy(id = "add_new_payee")
    private WebElement addButton;
    @FindBy(xpath = "//div[contains(text(), 'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    private WebElement purchaseForeignCurrencyButton;
    @FindBy(id = "pc_currency")
    private WebElement currencyDropDown;
    @FindBy(id = "pc_inDollars_true")
    private WebElement usDollarRadioButton;
    @FindBy(id = "pc_amount")
    private WebElement pcAmountInput;
    @FindBy(id = "tf_amount")
    private WebElement tfAmountInput;
    @FindBy(id = "purchase_cash")
    private WebElement purchaseButton;
    @FindBy(id = "transfer_funds_tab")
    private WebElement transferFundsButton;
    @FindBy(id = "tf_fromAccountId")
    private WebElement fromAccountDropDown;
    @FindBy(id = "tf_toAccountId")
    private WebElement toAccountDropDown;
    @FindBy(id = "btn_submit")
    private WebElement submitButton;



    WebElement myElement;
    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "zeroBank" : myElement =zeroBank; break;
            case "successMessage" : myElement =successMessage; break;

        }

        verifyContainsText(myElement,text);
    }
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "moreServicesButton" : myElement =moreServicesButton; break;
            case "payBillsButton" : myElement =payBillsButton; break;
            case "addNewPayeeButton" : myElement =addNewPayeeButton; break;
            case "addButton" : myElement =addButton; break;
            case "purchaseForeignCurrencyButton" : myElement =purchaseForeignCurrencyButton; break;
            case "usDollarRadioButton" : myElement =usDollarRadioButton; break;
            case "purchaseButton" : myElement =purchaseButton; break;
            case "transferFundsButton" : myElement =transferFundsButton; break;
            case "submitButton" : myElement =submitButton; break;
        }

        clickFunction(myElement);
    }
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "payeeNameInput" : myElement =payeeNameInput; break;
            case "payeeAddressInput" : myElement =payeeAddressInput; break;
            case "accountInput" : myElement =accountInput; break;
            case "pcAmountInput" : myElement =pcAmountInput; break;
            case "tfAmountInput" : myElement =tfAmountInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndSelectInList(String strElement, String value){
        switch (strElement)
        {
            case "currencyDropDown" : myElement =currencyDropDown; break;
            case "fromAccountDropDown" : myElement =fromAccountDropDown; break;
            case "toAccountDropDown" : myElement =toAccountDropDown; break;

        }

        selectValueDropDown(myElement, value);
    }

    public void findAndCheckIfEmpty(String strElement){

            switch (strElement)
            {
                case "payeeNameInput" : myElement =payeeNameInput; break;
                case "payeeAddressInput" : myElement =payeeAddressInput; break;
                case "accountInput" : myElement =accountInput; break;

            }

        requiredFieldsCheck(myElement);
    }


/*    public void findWarning(String strElement){
        switch (strElement)
        {
            case "payeeNameInput" : myElement =payeeNameInput; break;
            case "payeeAddressInput" : myElement =payeeAddressInput; break;
            case "accountInput" : myElement =accountInput; break;

        }

        getAttribute_(myElement, value);
    }*/

}
