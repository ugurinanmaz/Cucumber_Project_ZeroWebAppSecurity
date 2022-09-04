package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Parent{

    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    private WebElement loginInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(css = "input[name='submit']")
    private WebElement signInButton;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginInput" : myElement =loginInput; break;
            case "passwordInput" : myElement =passwordInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "signInButton" : myElement =signInButton; break;
        }

        clickFunction(myElement);
    }



}
