package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test(priority = 1, description = "TC001 - Verify valid login with correct credentials")
    public void validLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.login("test@gmail.com", "Test@1234");

        String title = loginPage.getPageTitle();
        Assert.assertTrue(title.contains("Account"),
            "Login failed! Page title: " + title);
        System.out.println("✅ TC001 - Valid login PASSED");
    }

    @Test(priority = 2, description = "TC002 - Verify error on invalid credentials")
    public void invalidLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.login("wrong@gmail.com", "wrongpassword");

        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Warning"),
            "Error message not shown for invalid login!");
        System.out.println("✅ TC002 - Invalid login error PASSED");
    }

    @Test(priority = 3, description = "TC003 - Verify error when both fields are empty")
    public void emptyFieldsLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.login("", "");

        String error = loginPage.getErrorMessage();
        Assert.assertNotNull(error, "No error shown for empty fields!");
        System.out.println("✅ TC003 - Empty fields validation PASSED");
    }
}
