package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    // Locators
    By searchBox    = By.name("search");
    By searchButton = By.cssSelector("button.btn-default");
    By searchResult = By.cssSelector("div.product-thumb");
    By noResultMsg  = By.cssSelector("div#content p");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String keyword) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed() {
        return driver.findElements(searchResult).size() > 0;
    }

    public String getNoResultMessage() {
        return driver.findElement(noResultMsg).getText();
    }
}
