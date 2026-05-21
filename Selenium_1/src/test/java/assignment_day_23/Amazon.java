package assignment_day_23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");
    }

    @Test(priority = 1)
    public void loginTest() throws Exception {

        Thread.sleep(2000);

        driver.findElement(By.id("nav-link-accountList"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("ap_email_login"))
                .sendKeys("7033474266");

        driver.findElement(By.id("continue"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("ap_password"))
                .sendKeys("User@1234");

        driver.findElement(By.id("signInSubmit"))
                .click();

        Thread.sleep(5000);

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void searchLaptopTest() throws Exception {

        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Laptop");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(5000);

        driver.findElement(By.partialLinkText("Laptop"))
                .click();

        Thread.sleep(5000);

        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
        }

        Thread.sleep(3000);

        System.out.println("Laptop Product Opened");
    }

    @Test(priority = 3)
    public void addLaptopToCart() throws Exception {

        driver.findElement(By.id("add-to-cart-button"))
                .click();

        Thread.sleep(200000);

        System.out.println("Laptop Added To Cart");
    }

    @AfterTest
    public void closeBrowser() {

        System.out.println(driver.getTitle());

        driver.quit();

        System.out.println("Browser Closed");
    }
}