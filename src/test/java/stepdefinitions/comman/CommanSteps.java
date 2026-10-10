package stepdefinitions.comman;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import pages.ApplicationPage;

public class CommanSteps {
    ApplicationPage applicationPage = new ApplicationPage();
    @Given("user opens parabank application")
    public void user_opens_parabank_application() {
        applicationPage.openApplication(ConfigReader.getProperty("base.url"));
    }

}
