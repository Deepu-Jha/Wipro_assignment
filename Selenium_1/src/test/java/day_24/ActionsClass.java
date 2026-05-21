package day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClick =
        driver.findElement(By.id("doubleClickBtn"));

        action.doubleClick(doubleClick).perform();

        Thread.sleep(3000);

        WebElement rightClick =
        driver.findElement(By.id("rightClickBtn"));

        action.contextClick(rightClick).perform();

        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/menu");

        WebElement menu =
        driver.findElement(By.xpath("//a[text()='Main Item 2']"));

        action.moveToElement(menu).perform();

        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/droppable");

        WebElement source =
        driver.findElement(By.id("draggable"));

        WebElement target =
        driver.findElement(By.id("droppable"));

        action.dragAndDrop(source, target).perform();

        Thread.sleep(3000);

        driver.quit();
    }
}