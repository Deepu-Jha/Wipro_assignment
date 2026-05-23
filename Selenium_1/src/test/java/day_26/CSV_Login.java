package day_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSV_Login {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String filePath = "C:\\Users\\naren\\Downloads\\loginData.csv";

        String line = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(filePath));

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String username = data[0];
                String password = data[1];

                driver.get("https://www.saucedemo.com/");

                driver.findElement(By.id("user-name")).clear();
                driver.findElement(By.id("user-name")).sendKeys(username);

                driver.findElement(By.id("password")).clear();
                driver.findElement(By.id("password")).sendKeys(password);

                driver.findElement(By.id("login-button")).click();

                System.out.println("Login Attempted With : " + username);

                Thread.sleep(3000);


                if (driver.getCurrentUrl().contains("inventory")) {

                    driver.findElement(By.id("react-burger-menu-btn")).click();

                    Thread.sleep(2000);

                    driver.findElement(By.id("logout_sidebar_link")).click();

                    Thread.sleep(2000);
                }
            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        driver.quit();
    }
}