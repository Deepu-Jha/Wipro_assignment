package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public void closePopup() {

        try {

            Thread.sleep(3000);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "document.getElementById('demoWarningModal').style.display='none';");

            System.out.println("Popup removed");

        } catch (Exception e) {

            System.out.println("Popup not present");
        }
    }

    public void login(String username, String pwd) {

        email.clear();
        email.sendKeys(username);

        password.clear();
        password.sendKeys(pwd);

        closePopup();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                loginBtn);

    }
}