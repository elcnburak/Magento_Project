package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US702Login {
    LeftNav ln=new LeftNav();
    @Given("user visits the Magento website")
    public void userVisitsTheMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        ln.consent.click();
    }

    @And("user clicks on Sign in section")
    public void userClicksOnSignInSection() {
        ln.myClick(ln.SignInLink);
    }

    @And("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        ln.mySendKeys(ln.logInEmail, "deneme98@gmail.com");
        ln.mySendKeys(ln.logInPassword, "Deneme98");
        ln.myClick(ln.logInButton);
    }

    @Then("user log ins successfully and confirms the log in")
    public void userLogInsSuccessfullyAndConfirmsTheLogIn() {
        ln.verifyContainsText(ln.verifyLogIn, "Welcome");
    }
}
