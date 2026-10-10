package stepdefinitions.accounts;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AccountsOverview;


public class Account_overview {

    AccountsOverview accountOverview = new AccountsOverview();

    @Then("customer account should be visible")
    public void customer_account_should_be_visible() {
        accountOverview.open_account_overview();
        System.out.println("account overview Opened");
        String actualText = accountOverview.getTextOnpage();
        Assert.assertEquals(actualText,"Accounts Overview");
        System.out.println(accountOverview.getTotalAccountNumbers());
        Assert.assertTrue(accountOverview.getTotalAccountNumbers() > 0);
    }
}
