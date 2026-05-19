package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.DriverFactory;

public class GoogleSteps {

    @Given("user opens Google page")
    public void open_google() {

        DriverFactory.getDriver()
                .get("https://www.google.com");
    }

    @Then("verify page title contains Google")
    public void verify_title() {

        String title =
                DriverFactory.getDriver().getTitle();

        Assert.assertTrue(title.contains("Google"));
    }
}