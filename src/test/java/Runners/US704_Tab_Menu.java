package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = {"src/test/java/FeatureFiles/US704_Tab_Menu.feature"},
        glue = {"StepDefinitions"}
)
public class US704_Tab_Menu extends AbstractTestNGCucumberTests {
}
