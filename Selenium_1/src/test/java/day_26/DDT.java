package day_26;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {

    public static void main(String[] args)
            throws EncryptedDocumentException, IOException, InterruptedException {

    	FileInputStream fis = new FileInputStream(
    			"C:\\Users\\naren\\OneDrive\\Documents\\Book4.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sh = wb.getSheet("Sheet1");

        int rows = sh.getLastRowNum();

        DataFormatter formatter = new DataFormatter();

        for (int i = 1; i <= rows; i++) {

            Row row = sh.getRow(i);

            if (row != null) {

                String Username =
                        formatter.formatCellValue(row.getCell(0));

                String Password =
                        formatter.formatCellValue(row.getCell(1));

                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();

                driver.get("https://www.saucedemo.com");

                System.out.println("Website Opened");

                driver.findElement(By.id("user-name"))
                        .sendKeys(Username);

                System.out.println("Username Entered : " + Username);

                driver.findElement(By.id("password"))
                        .sendKeys(Password);

                System.out.println("Password Entered");

                driver.findElement(By.id("login-button"))
                        .click();

                System.out.println("Login Button Clicked");

                Thread.sleep(3000);

                System.out.println("Login Test Completed");

                driver.quit();

                System.out.println("Browser Closed");

                System.out.println("--------------------------------");
            }
        }

        wb.close();
        fis.close();

        System.out.println("All DDT Test Cases Executed Successfully");
    }
}