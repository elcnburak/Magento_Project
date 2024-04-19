package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Runners/US708_Wish_List.java"},
        glue = {"StepDefinitions"}
)

public class US708_Wish_List extends AbstractTestNGCucumberTests {
}
