package assignment_day_26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");
    By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);

        driver.findElement(searchBtn).click();
    }
}