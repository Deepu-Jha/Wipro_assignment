package wipro_assignment_day_21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Selenium_amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("MacBook under 1 lakh");

        Thread.sleep(1000);

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox")).clear();

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("iPhone 17 Pro Max");

        Thread.sleep(1000);

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Apple iPhone"))
              .click();

        Thread.sleep(5000);


        System.out.println(driver.getTitle());

        driver.quit();
    }
}