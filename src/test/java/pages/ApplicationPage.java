package pages;

import config.ConfigReader;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplicationPage {
    WebDriver driver;
    WebDriverWait wait;
    private By userName = By.name("username");
    private By password = By.name("password");
    private By submitBtn = By.xpath("//*[@value=\"Log In\"]");
    private By pageText = By.xpath("//*[text() = \"Account Services\"]");
   public ApplicationPage(){
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public void openApplication(String url){
        driver.navigate().to(url);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void login(String username,String pass){
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(pass);
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
    }

    public String getText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageText)).getText();
    }
}
