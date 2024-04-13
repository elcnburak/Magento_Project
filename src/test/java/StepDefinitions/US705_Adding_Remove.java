package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US705_Adding_Remove extends GWD {
    @When("The user sees a random item and clicks the {string} button")
    public void theUserSeesARandomItemAndClicksTheButton(String arg0) throws InterruptedException {
        DialogContent dc=new DialogContent();

        dc.myClick(dc.MenMenu);
        dc.myClick(dc.MenJacketsMenu);
        dc.myClick(dc.RandomItem);
    }

    @And("The item is added to the cart, and a confirmation message is displayed to the user.")
    public void theItemIsAddedToTheCartAndAConfirmationMessageIsDisplayedToTheUser() {
    }

    @And("The user adjusts the quantity of the item")
    public void theUserAdjustsTheQuantityOfTheItem() {
    }

    @And("To remove an item from the cart")
    public void toRemoveAnItemFromTheCart() {
    }

    @And("The user reviews the contents of the cart and adjusts the quantities if desired using the QTY field.")
    public void theUserReviewsTheContentsOfTheCartAndAdjustsTheQuantitiesIfDesiredUsingTheQTYField() {
    }

    @Then("To apply the changes, the user must click the {string} button")
    public void toApplyTheChangesTheUserMustClickTheButton(String arg0) {
    }
}
