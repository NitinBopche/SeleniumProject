package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Khushi\\Desktop\\MyRepo\\SeleniumProject\\EclipsWorkspace\\CucumberFrame\\Features"},
		glue = "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/Cucumber-reports/report1.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class Run {
}