package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Locators
    By emailField     = By.id("input-email");
    By passwordField  = By.id("input-password");
    By loginButton    = By.cssSelector("input[value='Login']");
    By errorMessage   = By.cssSelector("div.alert-danger");
    By myAccountLink  = By.linkText("My Account");
    By loginLink      = By.linkText("Login");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void goToLoginPage() {
        driver.findElement(myAccountLink).click();
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        goToLoginPage();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getErrorMessage() {
        WebElement error = driver.findElement(errorMessage);
        return error.getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
