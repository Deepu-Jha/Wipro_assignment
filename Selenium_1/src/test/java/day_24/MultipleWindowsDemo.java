package day_24;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowsDemo {

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--disable-notifications");

        options.addArguments("--disable-popup-blocking");

        options.addArguments("--guest");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        Thread.sleep(3000);

        String parent = driver.getWindowHandle();

        System.out.println("Parent Window ID : " + parent);

        driver.findElement(By.id("windowButton")).click();

        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {

            driver.switchTo().window(win);

            System.out.println("Window ID : " + win);

            System.out.println("Title : " + driver.getTitle());

            System.out.println("URL : " + driver.getCurrentUrl());

            Thread.sleep(2000);

            if (!win.equals(parent)) {

                String text = driver.findElement(By.id("sampleHeading"))
                        .getText();

                System.out.println("Child Window Text : " + text);

                Thread.sleep(3000);

                driver.close();
            }
        }

        driver.switchTo().window(parent);

        System.out.println("Back To Parent Window");

        Thread.sleep(3000);

        driver.quit();
    }
}