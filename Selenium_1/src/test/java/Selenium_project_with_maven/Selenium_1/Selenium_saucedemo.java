package Selenium_project_with_maven.Selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 class Selenium_saucedemo {
    WebDriver driver;
   
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }
  
    public void loginTest() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.getTitle());

        Thread.sleep(3000);
    }
 
    public void tearDown() {

        driver.quit();
    }
}