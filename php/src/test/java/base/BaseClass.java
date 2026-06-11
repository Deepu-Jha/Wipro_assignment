package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static Properties prop;

    public static void setup() throws IOException {

        prop = new Properties();

        String configPath =
                System.getProperty("user.dir")
                + "/src/test/resources/config/config.properties";

        FileInputStream fis =
                new FileInputStream(configPath);

        prop.load(fis);

        String browser =
                prop.getProperty("browser");

        String url =
                prop.getProperty("url");

        System.out.println("Browser = " + browser);
        System.out.println("URL = " + url);

        if (browser == null || browser.isEmpty()) {

            throw new RuntimeException(
                    "browser value not found in config.properties");
        }

        if (url == null || url.isEmpty()) {

            throw new RuntimeException(
                    "url value not found in config.properties");
        }

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();
        }

        else if (browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();

            driver = new EdgeDriver();
        }

        else {

            throw new RuntimeException(
                    "Invalid browser name in config.properties : "
                            + browser);
        }

        DriverFactory.setDriver(driver);

        DriverFactory.getDriver()
                .manage()
                .window()
                .maximize();

        DriverFactory.getDriver()
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        DriverFactory.getDriver()
                .get(url);
    }

    public static void tearDown() {

        if (DriverFactory.getDriver() != null) {

            DriverFactory.getDriver().quit();

            DriverFactory.unload();
        }
    }
}