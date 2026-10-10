package pages;

import config.ConfigReader;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AccountsOverview {
     WebDriver driver;
     WebDriverWait wait;
     private By accounts_overview = By.linkText("Accounts Overview");
     private By accountHeader = By.cssSelector("#showOverview h1.title");
     private By accounts = By.xpath("//table[@id=\"accountTable\"]/tbody/tr/td");
     public AccountsOverview(){
         driver = DriverManager.getDriver();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     }

     public void open_account_overview(){
         wait.until(ExpectedConditions.elementToBeClickable(accounts_overview)).click();
     }

     public String getTextOnpage(){

         return wait.until(
                 ExpectedConditions.visibilityOfElementLocated(
                         accountHeader)).getText();
     }
     public int getTotalAccountNumbers(){
        List<WebElement> accNumbers= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(accounts));
         return accNumbers.size();
     }

}
