package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static String captureScreenshot(
            WebDriver driver,
            String name) {

        try {

            String timestamp =
                    new SimpleDateFormat(
                            "yyyyMMdd_HHmmss")
                            .format(new Date());

            String path =
                    "screenshots/"
                    + name + "_"
                    + timestamp + ".png";

            File src =
                    ((TakesScreenshot)driver)
                            .getScreenshotAs(
                                    OutputType.FILE);

            FileUtils.copyFile(
                    src,
                    new File(path));

            return path;

        } catch(Exception e) {

            return null;
        }
    }
}