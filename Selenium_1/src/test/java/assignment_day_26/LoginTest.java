package assignment_day_26;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() throws Exception {

        setup();

        LoginPage lp = new LoginPage(driver);

        lp.clickMyAccount();

        lp.clickLogin();

        lp.enterEmail("test@gmail.com");

        lp.enterPassword("12345");

        lp.clickLoginButton();

        closeBrowser();
    }
}