package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Runners/US706_Product_Ordering.java"},
        glue = {"StepDefinitions"}
)

public class US706_Product_Ordering extends AbstractTestNGCucumberTests {
}
