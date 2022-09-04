package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Test Started!");
    }

    @After
    public void after()
    {
        // ekran görüntüsü al senaryo hatalı ise
        BaseDriver.quitDriver();
    }

}