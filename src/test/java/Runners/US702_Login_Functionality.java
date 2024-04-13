package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US702_Login_FunctionalityPositiveTC.feature"},
        glue = {"StepDefinitions"}
)
public class US702_Login_Functionality extends AbstractTestNGCucumberTests {

}
