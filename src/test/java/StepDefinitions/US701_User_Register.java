package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

public class US701_User_Register extends GWD {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Magento")
    public void navigateToMagento() {
        System.out.println("Magento Website Açıldı");
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Register information and click register button")
    public void registerInformationAndClickRegisterButton() {
        System.out.println("Kullanıcı bilgileri gönderildi");
        dc.myClick(dc.content);
        dc.myClick(dc.createAccountButton);
        dc.mySendKeys(dc.registerName, "Murat");
        dc.mySendKeys(dc.registerLastName, "Türk");
        dc.mySendKeys(dc.registerEmail, "deneme98@gmail.com");
        dc.mySendKeys(dc.registerPassword, "Deneme98");
        dc.mySendKeys(dc.registerPasswordConfirm, "Deneme98");
        dc.myClick(dc.registerButton);
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        // Get the current URL
        String currentUrl = GWD.getDriver().getCurrentUrl();

        // Assert that the current URL contains the expected URL
        Assert.assertTrue(currentUrl.contains("https://magento.softwaretestingboard.com/customer/account/"),
                "Registration was not successful. Expected URL not found.");

        System.out.println("User should register successfully");
    }
}




