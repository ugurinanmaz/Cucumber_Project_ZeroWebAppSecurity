package Pages;

import Utilities.BaseDriver;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.cucumber.java.eo.Se;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {//3.Aşama
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element); // elemente scroll yap
        element.clear();   // temizle
        element.sendKeys(value); // değeri gönder
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        //scrollToElement(element); // elemente scroll yap
        element.click(); // click yap
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void selectValueDropDown(WebElement element, String value){
        waitUntilVisible(element);
        Select select = new Select(element);
        select.selectByValue(value);

    }

    public void requiredFieldsCheck(WebElement element){
        waitUntilVisible(element);
        String  isRequiredText = element.getAttribute("required");
//        Boolean isRequired = Boolean.parseBoolean(element.getAttribute("required"));
        String elementText = element.getText();
        System.out.println(elementText);
        System.out.println(isRequiredText);
        Assert.assertEquals("",elementText);
        //

    }

/*    public void getAttribute_(WebElement element, String field)
    {
        waitUntilVisible(element);

        System.out.println(element.getAttribute("validationMessage"));
    }*/
}
