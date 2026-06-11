package runners;

import io.cucumber.testng.*;

import org.testng.annotations.DataProvider;

@CucumberOptions(

features =
"src/test/resources",

glue =
{"stepdefinitions","hooks"},

plugin =
{
"pretty",
"html:reports/report.html"
}

)

public class TestRunner
extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)

    public Object[][] scenarios() {

        return super.scenarios();
    }
}