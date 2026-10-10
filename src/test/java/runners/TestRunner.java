package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/accounts/account_overview.feature",
        glue = {"stepdefinitions","hooks"},
        plugin = {"pretty"},
        monochrome = true
        //tags = "@environment or @smoke or @authentication"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
