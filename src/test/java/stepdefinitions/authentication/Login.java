package stepdefinitions.authentication;

import config.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApplicationPage;

public class Login {
    ApplicationPage applicationPage = new ApplicationPage();

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        applicationPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
    }
    @Then("account overview page should displayed")
    public void account_overview_page_should_displayed() {
        String textOnPage = applicationPage.getText();
        Assert.assertEquals(textOnPage,"Account Services");
    }

}
