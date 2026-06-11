package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import hooks.Hooks;

public class ScreenshotUtil {

    public static void captureScreenshot(String name)
            throws Exception {

        TakesScreenshot ts =
                (TakesScreenshot) Hooks.driver;

        File src =
                ts.getScreenshotAs(OutputType.FILE);

        File dest =
                new File("Screenshots/" + name + ".png");

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot saved");
    }
}