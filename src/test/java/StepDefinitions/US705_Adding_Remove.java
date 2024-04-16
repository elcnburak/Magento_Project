package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class US705_Adding_Remove extends GWD {
    @When("The user sees a random item and clicks the {string} button")
    public void theUserSeesARandomItemAndClicksTheButton(String arg0) throws InterruptedException {
        DialogContent dc=new DialogContent();

        dc.myClick(dc.MenMenu);

        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", dc.product1);

        dc.myClick(dc.product1M);
        dc.myClick(dc.product1Colour);
        dc.myClear(dc.product1Qty);
        dc.mySendKeys(dc.product1Qty,"10");
        dc.myClick(dc.product1AddtoCart);
    }

    @And("The item is added to the cart, and a confirmation message is displayed to the user.")
    public void theItemIsAddedToTheCartAndAConfirmationMessageIsDisplayedToTheUser() {

        Duration duration = Duration.ofSeconds(10);

        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        WebElement theCartAddMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.message-success")));

        Assert.assertTrue(theCartAddMessage.isDisplayed(), "The cart add message is not displayed on the page.");

        String expectedMessage = "You added Hero Hoodie to your";

        String actualMessage = theCartAddMessage.getText();

        Assert.assertTrue(actualMessage.contains(expectedMessage), "The cart add message is not as expected.");
    }

    @And("The user adjusts the quantity of the item")
    public void theUserAdjustsTheQuantityOfTheItem() {
        DialogContent dc=new DialogContent();

        dc.myClick(dc.theCart);
        JavascriptExecutor executor1 = (JavascriptExecutor) getDriver();
        executor1.executeScript("arguments[0].value = '';", dc.theCartQty);

        dc.mySendKeys(dc.theCartQty,"14");
        dc.myClick(dc.theCartUpdate);
    }

    @And("To remove an item from the cart")
    public void toRemoveAnItemFromTheCart() {
        DialogContent dc=new DialogContent();
        dc.myClick(dc.theCartDelete);
        dc.myClick(dc.theCartDeleteOk);
    }

}
