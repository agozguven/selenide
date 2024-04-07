package common;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {
                //"pretty",
                "summary",
                // "html:build/cucumber-reports/cucumber-pretty",
                // "json:build/cucumber-reports/CucumberTestReport.json",
                "rerun:build/cucumber-reports/rerun.txt",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@testElementPage"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
