package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Runners/US703_Address_Addition.java"},
        glue = {"StepDefinitions"}
)

public class US703_Address_Addition extends AbstractTestNGCucumberTests {
}
