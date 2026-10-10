package stepdefinitions.environment;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ApplicationPage;

public class ApplicationAvailability {
   ApplicationPage applicationPage = new ApplicationPage();
   String url = ConfigReader.getProperty("base.url");

    @Then("application homepage should displayed")
    public void application_homepage_should_displayed() {
        Assert.assertTrue(
               applicationPage
                       .getCurrentUrl()
                               .contains(url)
        );
    }
}
