package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    SearchPage searchPage;

    @Test(priority = 1, description = "TC004 - Search with valid product name")
    public void validSearchTest() {
        searchPage = new SearchPage(driver);
        searchPage.searchProduct("MacBook");

        boolean result = searchPage.isProductDisplayed();
        Assert.assertTrue(result, "No products found for valid search!");
        System.out.println("✅ TC004 - Valid search PASSED");
    }

    @Test(priority = 2, description = "TC005 - Search with invalid/random keyword")
    public void invalidSearchTest() {
        searchPage = new SearchPage(driver);
        searchPage.searchProduct("xyzabc12345notexist");

        boolean result = searchPage.isProductDisplayed();
        Assert.assertFalse(result, "Products shown for invalid search!");
        System.out.println("✅ TC005 - Invalid search PASSED");
    }
}
