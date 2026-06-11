package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By addCart = By.id("add-to-cart-sauce-labs-backpack");

    By cart = By.className("shopping_cart_link");

    By checkout = By.id("checkout");

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    public void addProduct() {

        driver.findElement(addCart).click();
    }

    public void openCart() {

        driver.findElement(cart).click();
    }

    public void checkout() {

        driver.findElement(checkout).click();
    }
}