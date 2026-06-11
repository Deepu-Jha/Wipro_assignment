package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductPage;

public class LoginSteps {

    WebDriver driver = Hooks.driver;

    LoginPage lp;
    ProductPage pp;

    WebDriverWait wait;

    @Given("User launches browser")
    public void user_launches_browser() {

        System.out.println("Browser launched successfully");
    }

    @When("User login using {string} and {string}")
    public void user_login_using_and(String username, String password) {

        lp = new LoginPage(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("user-name")));

        lp.login(username, password);

        System.out.println("Login successful");
    }

    @When("User searches product")
    public void user_searches_product() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("title")));

        System.out.println("Product searched");
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {

        pp = new ProductPage(driver);

      
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-backpack")));

        pp.addProduct();

        System.out.println("Product added to cart");

      
        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("shopping_cart_link")));

        pp.openCart();
    }

    @Then("User proceeds to checkout")
    public void user_proceeds_to_checkout() {

   
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("checkout")));

        pp.checkout();

        System.out.println("Checkout completed");
    }
}