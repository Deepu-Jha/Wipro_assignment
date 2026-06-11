package listeners;

import org.testng.*;

public class TestListener
implements ITestListener {

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                "STARTED : "
                + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                "PASSED : "
                + result.getName());
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        System.out.println(
                "FAILED : "
                + result.getName());

        System.out.println(
                result.getThrowable());
    }

    @Override
    public void onFinish(
            ITestContext context) {

        System.out.println(
                "Execution Finished");
    }
}