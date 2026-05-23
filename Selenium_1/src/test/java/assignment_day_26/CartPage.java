package assignment_day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton =
    By.xpath("//button[@class='btn btn-default btn-lg']");

    By addToCartButtons =
    By.xpath("//button[contains(@onclick,'cart.add')]");

    By cartButton =
    By.id("cart-total");

    By checkoutButton =
    By.linkText("Checkout");

    By guestCheckout =
    By.xpath("//input[@value='guest']");

    By continueButton =
    By.id("button-account");

    By firstName =
    By.id("input-payment-firstname");

    By lastName =
    By.id("input-payment-lastname");

    By email =
    By.id("input-payment-email");

    By telephone =
    By.id("input-payment-telephone");

    By address =
    By.id("input-payment-address-1");

    By city =
    By.id("input-payment-city");

    By postcode =
    By.id("input-payment-postcode");

    By country =
    By.id("input-payment-country");

    By region =
    By.id("input-payment-zone");

    By continueBilling =
    By.id("button-guest");

    public void searchProduct(String product) {

        driver.findElement(searchBox).clear();

        driver.findElement(searchBox).sendKeys(product);

        driver.findElement(searchButton).click();
    }

    public void addProduct(int index) {

        driver.findElements(addToCartButtons)
        .get(index).click();
    }

    public void clickCart() {

        driver.findElement(cartButton).click();
    }

    public void clickCheckout() {

        driver.findElement(checkoutButton).click();
    }

    public void guestCheckout() {

        driver.findElement(guestCheckout).click();

        driver.findElement(continueButton).click();
    }

    public void billingDetails() {

        driver.findElement(firstName).sendKeys("Narendra");

        driver.findElement(lastName).sendKeys("Jha");

        driver.findElement(email).sendKeys("test@gmail.com");

        driver.findElement(telephone).sendKeys("9876543210");

        driver.findElement(address).sendKeys("Delhi");

        driver.findElement(city).sendKeys("Delhi");

        driver.findElement(postcode).sendKeys("110001");

        driver.findElement(country).sendKeys("India");

        driver.findElement(region).sendKeys("Delhi");

        driver.findElement(continueBilling).click();
    }
}