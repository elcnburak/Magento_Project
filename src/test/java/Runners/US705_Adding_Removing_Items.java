package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Runners/US705_Adding_Remove.java"},
        glue = {"StepDefinitions"}
)

public class US705_Adding_Removing_Items extends AbstractTestNGCucumberTests {
}
