package day_24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName"))
                .sendKeys("Narendra Kumar Jha");

        Thread.sleep(2000);

        driver.findElement(By.id("userEmail"))
                .sendKeys("narendra@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.id("currentAddress"))
                .sendKeys("Katihar Bihar");

        Thread.sleep(2000);

        driver.findElement(By.id("permanentAddress"))
                .sendKeys("Bangalore Karnataka");

        Thread.sleep(2000);

        driver.findElement(By.id("submit"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("userName"))
                .clear();

        driver.findElement(By.id("userEmail"))
                .clear();

        driver.findElement(By.id("currentAddress"))
                .clear();

        driver.findElement(By.id("permanentAddress"))
                .clear();

        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}