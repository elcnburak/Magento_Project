package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Runners/US707_Search_Fun.java"},
        glue = {"StepDefinitions"}
)

public class US707_Search_Functionality extends AbstractTestNGCucumberTests {
}
