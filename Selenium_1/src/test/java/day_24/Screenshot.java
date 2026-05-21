package day_24;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com");

        Thread.sleep(3000);

        TakesScreenshot ts =
        (TakesScreenshot) driver;

        File source =
        ts.getScreenshotAs(OutputType.FILE);

        File destination =
        new File("C:\\Screenshots\\demoqa.png");

        Files.copy(source, destination);

        System.out.println("Screenshot Taken");

        driver.quit();
    }
}