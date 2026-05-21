package assignement_day_22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ecommerce_Assignment {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--disable-notifications");

        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void loginTest() throws Exception {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button"))
                .click();

        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void searchAndFilterTest() throws Exception {

        WebElement filter =
                driver.findElement(By.className("product_sort_container"));

        Select select = new Select(filter);

        select.selectByVisibleText("Price (low to high)");

        Thread.sleep(3000);

        System.out.println("Filter Applied Successfully");
    }

    @Test(priority = 3)
    public void addProductToCart() throws Exception {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(3000);

        System.out.println("Product Added To Cart");
    }

    @Test(priority = 4)
    public void checkoutProcess() throws Exception {

        driver.findElement(By.id("checkout"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name"))
                .sendKeys("Narendra");

        driver.findElement(By.id("last-name"))
                .sendKeys("Jha");

        driver.findElement(By.id("postal-code"))
                .sendKeys("854105");

        Thread.sleep(2000);

        driver.findElement(By.id("continue"))
                .click();

        Thread.sleep(2000);

        driver.findElement(By.id("finish"))
                .click();

        Thread.sleep(3000);

        String confirmationText =
                driver.findElement(By.className("complete-header"))
                        .getText();

        Assert.assertEquals(confirmationText,
                "Thank you for your order!");

        System.out.println("Checkout Completed Successfully");
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();

        System.out.println("Browser Closed");
    }
}
